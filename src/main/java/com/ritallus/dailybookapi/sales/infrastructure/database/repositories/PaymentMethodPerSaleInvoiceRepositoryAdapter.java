package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.models.PaymentMethodPerSaleInvoice;
import com.ritallus.dailybookapi.sales.domain.repositories.PaymentMethodPerSaleInvoiceRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.PaymentMethodPerSaleInvoiceRepositoryJpa;
import com.ritallus.dailybookapi.sales.infrastructure.mappers.PaymentMethodPerSaleInvoiceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class PaymentMethodPerSaleInvoiceRepositoryAdapter implements PaymentMethodPerSaleInvoiceRepositoryPort {

    private final PaymentMethodPerSaleInvoiceRepositoryJpa paymentMethodPerSaleInvoiceRepositoryJpa;
    private final PaymentMethodPerSaleInvoiceMapper mapper;

    @Override
    public PaymentMethodPerSaleInvoice save(PaymentMethodPerSaleInvoice paymentMethodPerSaleInvoice) {
        return mapper.toModel(paymentMethodPerSaleInvoiceRepositoryJpa.save(mapper.toEntity(paymentMethodPerSaleInvoice)));
    }
}
