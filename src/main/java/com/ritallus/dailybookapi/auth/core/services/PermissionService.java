package com.ritallus.dailybookapi.auth.core.services;


import com.ritallus.dailybookapi.auth.core.services.ports.PermissionServicePort;
import com.ritallus.dailybookapi.auth.domain.repositories.PermissionRepositoryPort;


public class PermissionService implements PermissionServicePort {
    private final PermissionRepositoryPort repository;

    public PermissionService(PermissionRepositoryPort repository) {
        this.repository = repository;
    }
}