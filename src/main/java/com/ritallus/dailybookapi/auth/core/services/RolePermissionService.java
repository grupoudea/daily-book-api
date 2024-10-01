package com.ritallus.dailybookapi.auth.core.services;


import com.ritallus.dailybookapi.auth.core.services.ports.RolePermissionServicePort;
import com.ritallus.dailybookapi.auth.domain.repositories.RolePermissionRepositoryPort;


public class RolePermissionService implements RolePermissionServicePort {
    private final RolePermissionRepositoryPort repository;

    public RolePermissionService(RolePermissionRepositoryPort repository) {
        this.repository = repository;
    }
}