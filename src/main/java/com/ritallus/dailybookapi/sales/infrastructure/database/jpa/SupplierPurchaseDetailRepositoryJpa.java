package com.ritallus.dailybookapi.sales.infrastructure.database.jpa;

import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities.SupplierPurchaseDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierPurchaseDetailRepositoryJpa extends JpaRepository<SupplierPurchaseDetailEntity, Long> {

}
