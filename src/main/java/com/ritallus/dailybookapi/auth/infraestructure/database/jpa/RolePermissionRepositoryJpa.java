package com.ritallus.dailybookapi.auth.infraestructure.database.jpa;

import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.entities.RolePermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolePermissionRepositoryJpa extends JpaRepository<RolePermissionEntity, Long> {

}
