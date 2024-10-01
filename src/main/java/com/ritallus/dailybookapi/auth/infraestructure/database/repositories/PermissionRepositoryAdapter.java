package com.ritallus.dailybookapi.auth.infraestructure.database.repositories;

import com.ritallus.dailybookapi.auth.domain.repositories.PermissionRepositoryPort;
import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.PermissionRepositoryJpa;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class PermissionRepositoryAdapter implements PermissionRepositoryPort {

    private final PermissionRepositoryJpa permissionRepositoryJpa;

}
