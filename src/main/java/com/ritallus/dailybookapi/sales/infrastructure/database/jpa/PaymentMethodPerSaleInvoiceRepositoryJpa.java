package com.ritallus.dailybookapi.sales.infrastructure.database.jpa;

import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities.PaymentMethodPerSaleInvoiceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentMethodPerSaleInvoiceRepositoryJpa extends JpaRepository<PaymentMethodPerSaleInvoiceEntity, Long> {

}
