package com.ritallus.dailybookapi.auth.infraestructure.database.jpa;

import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepositoryJpa extends JpaRepository<RoleEntity, Long> {

}
