package com.ritallus.dailybookapi.sales.infrastructure.database.jpa;

import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities.SupplierPurchaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierPurchaseRepositoryJpa extends JpaRepository<SupplierPurchaseEntity, Long> {

}
