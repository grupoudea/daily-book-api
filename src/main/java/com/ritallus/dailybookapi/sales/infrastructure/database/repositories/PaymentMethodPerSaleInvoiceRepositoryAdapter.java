package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.repositories.PaymentMethodPerSaleInvoiceRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.PaymentMethodPerSaleInvoiceRepositoryJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PaymentMethodPerSaleInvoiceRepositoryAdapter implements PaymentMethodPerSaleInvoiceRepositoryPort {

    private final PaymentMethodPerSaleInvoiceRepositoryJpa paymentMethodPerSaleInvoiceRepositoryJpa;

}
