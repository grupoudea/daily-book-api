package com.ritallus.dailybookapi.auth.infraestructure.database.jpa;

import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepositoryJpa extends JpaRepository<RoleEntity, Long> {

    Optional<RoleEntity> findByName(String name);
}
