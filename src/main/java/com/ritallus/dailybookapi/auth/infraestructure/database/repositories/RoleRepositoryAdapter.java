package com.ritallus.dailybookapi.auth.infraestructure.database.repositories;

import com.ritallus.dailybookapi.auth.domain.models.Role;
import com.ritallus.dailybookapi.auth.domain.repositories.RoleRepositoryPort;
import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.RoleRepositoryJpa;
import com.ritallus.dailybookapi.auth.infraestructure.mappers.RoleMapper;
import com.ritallus.dailybookapi.commons.MessageResponse;
import com.ritallus.dailybookapi.commons.exceptions.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class RoleRepositoryAdapter implements RoleRepositoryPort {

    private final RoleRepositoryJpa roleRepositoryJpa;
    private final RoleMapper roleMapper;

    public Optional<Role> findByName(String name) {
        return Optional.ofNullable(roleMapper.toModel(roleRepositoryJpa.findByName(name).orElseThrow(() ->
                new DataNotFoundException(MessageResponse.ROLE_NOT_FOUND_EXCEPTION))));
    }
}
