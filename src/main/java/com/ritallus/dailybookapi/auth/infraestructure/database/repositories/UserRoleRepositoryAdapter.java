package com.ritallus.dailybookapi.auth.infraestructure.database.repositories;

import com.ritallus.dailybookapi.auth.domain.models.UserRole;
import com.ritallus.dailybookapi.auth.domain.repositories.UserRoleRepositoryPort;
import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.UserRoleRepositoryJpa;
import com.ritallus.dailybookapi.auth.infraestructure.mappers.UserRoleMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserRoleRepositoryAdapter implements UserRoleRepositoryPort {

    private final UserRoleRepositoryJpa userRoleRepositoryJpa;
    private final UserRoleMapper userRoleMapper;

    public UserRole save(UserRole userRole) {
        return userRoleMapper.toModel(userRoleRepositoryJpa.save(userRoleMapper.toEntity(userRole)));
    }
}
