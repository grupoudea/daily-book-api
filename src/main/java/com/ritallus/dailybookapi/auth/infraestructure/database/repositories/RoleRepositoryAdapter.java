package com.ritallus.dailybookapi.auth.infraestructure.database.repositories;

import com.ritallus.dailybookapi.auth.domain.repositories.RoleRepositoryPort;
import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.RoleRepositoryJpa;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class RoleRepositoryAdapter implements RoleRepositoryPort {

    private final RoleRepositoryJpa roleRepositoryJpa;

}
