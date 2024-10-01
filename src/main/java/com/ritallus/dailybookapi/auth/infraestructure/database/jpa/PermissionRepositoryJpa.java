package com.ritallus.dailybookapi.auth.infraestructure.database.jpa;

import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.entities.PermissionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PermissionRepositoryJpa extends JpaRepository<PermissionEntity, Long> {

}
