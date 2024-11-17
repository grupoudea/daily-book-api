package com.ritallus.dailybookapi.sales.infrastructure.database.jpa;

import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities.SaleInvoiceDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleInvoiceDetailRepositoryJpa extends JpaRepository<SaleInvoiceDetailEntity, Long> {

}
