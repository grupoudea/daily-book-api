package com.ritallus.dailybookapi.auth.infraestructure.database.repositories;

import com.ritallus.dailybookapi.auth.domain.repositories.RolePermissionRepositoryPort;
import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.RolePermissionRepositoryJpa;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RolePermissionRepositoryAdapter implements RolePermissionRepositoryPort {

    private final RolePermissionRepositoryJpa rolePermissionRepositoryJpa;

}
