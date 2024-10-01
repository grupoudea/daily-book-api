package com.ritallus.dailybookapi.auth.infraestructure.database.repositories;

import com.ritallus.dailybookapi.auth.domain.repositories.UserRoleRepositoryPort;
import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.UserRoleRepositoryJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRoleRepositoryAdapter implements UserRoleRepositoryPort {

    private final UserRoleRepositoryJpa userRoleRepositoryJpa;

}
