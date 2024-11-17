package com.ritallus.dailybookapi.sales.domain.repositories;

import com.ritallus.dailybookapi.sales.domain.models.PaymentMethodPerSaleInvoice;

public interface PaymentMethodPerSaleInvoiceRepositoryPort {
    PaymentMethodPerSaleInvoice save(PaymentMethodPerSaleInvoice paymentMethodPerSaleInvoice);
}
