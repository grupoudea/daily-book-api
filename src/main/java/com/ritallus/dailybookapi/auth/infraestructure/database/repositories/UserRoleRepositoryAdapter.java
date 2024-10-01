package com.ritallus.dailybookapi.auth.infraestructure.database.repositories;

import com.ritallus.dailybookapi.auth.domain.repositories.UserRoleRepositoryPort;
import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.UserRoleRepositoryJpa;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRoleRepositoryAdapter implements UserRoleRepositoryPort {

    private final UserRoleRepositoryJpa userRoleRepositoryJpa;

}
