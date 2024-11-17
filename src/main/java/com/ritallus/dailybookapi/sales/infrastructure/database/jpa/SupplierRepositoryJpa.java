package com.ritallus.dailybookapi.sales.infrastructure.database.jpa;

import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepositoryJpa extends JpaRepository<SupplierEntity, Long> {

}
