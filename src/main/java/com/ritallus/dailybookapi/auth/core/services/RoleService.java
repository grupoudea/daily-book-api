package com.ritallus.dailybookapi.auth.core.services;


import com.ritallus.dailybookapi.auth.core.services.ports.RoleServicePort;
import com.ritallus.dailybookapi.auth.domain.repositories.RoleRepositoryPort;


public class RoleService implements RoleServicePort {
    private final RoleRepositoryPort repository;

    public RoleService(RoleRepositoryPort repository) {
        this.repository = repository;
    }
}