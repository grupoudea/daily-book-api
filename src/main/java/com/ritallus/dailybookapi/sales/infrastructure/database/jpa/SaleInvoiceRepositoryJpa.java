package com.ritallus.dailybookapi.sales.infrastructure.database.jpa;

import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities.SaleInvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleInvoiceRepositoryJpa extends JpaRepository<SaleInvoiceEntity, Long> {

}
