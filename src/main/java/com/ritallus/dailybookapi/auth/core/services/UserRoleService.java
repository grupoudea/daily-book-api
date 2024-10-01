package com.ritallus.dailybookapi.auth.core.services;


import com.ritallus.dailybookapi.auth.core.services.ports.UserRoleServicePort;
import com.ritallus.dailybookapi.auth.domain.repositories.UserRoleRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class UserRoleService implements UserRoleServicePort {
    private final UserRoleRepositoryPort repository;

}