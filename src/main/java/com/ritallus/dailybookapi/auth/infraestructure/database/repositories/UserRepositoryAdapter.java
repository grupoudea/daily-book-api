package com.ritallus.dailybookapi.auth.infraestructure.database.repositories;

import com.ritallus.dailybookapi.auth.domain.repositories.UserRepositoryPort;
import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.UserRepositoryJpa;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserRepositoryJpa userRepositoryJpa;

}
