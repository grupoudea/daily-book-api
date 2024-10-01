package com.ritallus.dailybookapi.auth.core.services;


import com.ritallus.dailybookapi.auth.core.services.ports.UserServicePort;
import com.ritallus.dailybookapi.auth.domain.models.User;
import com.ritallus.dailybookapi.auth.domain.repositories.UserRepositoryPort;
import com.ritallus.dailybookapi.commons.CustomUtilService;
import com.ritallus.dailybookapi.commons.MessageResponse;
import com.ritallus.dailybookapi.commons.exceptions.DataNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class UserService implements UserServicePort {
    private final UserRepositoryPort repository;

    public User findByEmail(String email) {
        return repository.findByEmail(email).orElseThrow(() ->
                new DataNotFoundException(MessageResponse.USER_NOT_FOUND_EXCEPTION));
    }

    public User update(User user) {
        CustomUtilService.ValidateRequired(user.getId());
        user.setLastUpdate(LocalDateTime.now());
        return repository.save(user);
    }
}