package com.ritallus.dailybookapi.auth.domain.repositories;

import com.ritallus.dailybookapi.auth.domain.models.Role;

import java.util.Optional;

public interface RoleRepositoryPort {
    Optional<Role> findByName(String name);
}
