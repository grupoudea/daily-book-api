package com.ritallus.dailybookapi.auth.core.services;


import com.ritallus.dailybookapi.auth.core.services.ports.UserRoleServicePort;
import com.ritallus.dailybookapi.auth.domain.repositories.UserRoleRepositoryPort;


public class UserRoleService implements UserRoleServicePort {
    private final UserRoleRepositoryPort repository;

    public UserRoleService(UserRoleRepositoryPort repository) {
        this.repository = repository;
    }
}