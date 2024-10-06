package com.ritallus.dailybookapi.auth.core.services;


import com.ritallus.dailybookapi.auth.core.services.ports.UserRoleServicePort;
import com.ritallus.dailybookapi.auth.domain.models.UserRole;
import com.ritallus.dailybookapi.auth.domain.repositories.UserRoleRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class UserRoleService implements UserRoleServicePort {
    private final UserRoleRepositoryPort repository;

    public UserRole save(UserRole userRole) {
        userRole.setCreatedDate(LocalDateTime.now());
        userRole.setLastUpdate(LocalDateTime.now());
        return repository.save(userRole);
    }

}