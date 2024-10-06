package com.ritallus.dailybookapi.auth.core.services;


import com.ritallus.dailybookapi.auth.core.dtos.UserRegisterRequest;
import com.ritallus.dailybookapi.auth.core.services.ports.RoleServicePort;
import com.ritallus.dailybookapi.auth.core.services.ports.UserRoleServicePort;
import com.ritallus.dailybookapi.auth.core.services.ports.UserServicePort;
import com.ritallus.dailybookapi.auth.domain.models.User;
import com.ritallus.dailybookapi.auth.domain.models.UserRole;
import com.ritallus.dailybookapi.auth.domain.repositories.UserRepositoryPort;
import com.ritallus.dailybookapi.commons.Constants;
import com.ritallus.dailybookapi.commons.CustomUtilService;
import com.ritallus.dailybookapi.commons.MessageResponse;
import com.ritallus.dailybookapi.commons.exceptions.DataNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService implements UserServicePort {
    private final UserRepositoryPort repository;
    private final RoleServicePort roleServicePort;
    private final UserRoleServicePort userRoleServicePort;

    public User findByEmail(String email) {
        return repository.findByEmail(email).orElseThrow(() ->
                new DataNotFoundException(MessageResponse.USER_NOT_FOUND_EXCEPTION));
    }

    public User update(User user) {
        CustomUtilService.ValidateRequired(user.getId());
        user.setLastUpdate(LocalDateTime.now());
        return repository.save(user);
    }

    public User save(User user) {
        user.setCreatedDate(LocalDateTime.now());
        user.setLastUpdate(LocalDateTime.now());
        return repository.save(user);
    }

    public User register(UserRegisterRequest request) {
        CustomUtilService.ValidateRequired(request.getEmail());
        CustomUtilService.ValidateRequired(request.getName());
        CustomUtilService.ValidateRequired(request.getPassword());

        repository.validateExistsEmail(request.getEmail());

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(request.getPassword());

        var user = User.builder()
                .email(request.getEmail())
                .username(CustomUtilService.GetNameFromEmail(request.getEmail()))
                .password(encodedPassword)
                .name(request.getName())
                .lastname(request.getLastname())
                .status(Constants.UserStatus.ACTIVE.name())
                .build();
        User userSaved = save(user);

        var role = roleServicePort.findByName(Constants.ROLE_SUPER_USER);
        var userRole = UserRole.builder()
                .idRole(role.getId())
                .idUser(userSaved.getId())
                .build();
        userRoleServicePort.save(userRole);
        return userSaved;
    }
}