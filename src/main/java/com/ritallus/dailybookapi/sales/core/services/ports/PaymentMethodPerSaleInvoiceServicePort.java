package com.ritallus.dailybookapi.sales.core.services.ports;

import com.ritallus.dailybookapi.sales.domain.models.PaymentMethodPerSaleInvoice;

public interface PaymentMethodPerSaleInvoiceServicePort {
    PaymentMethodPerSaleInvoice save(PaymentMethodPerSaleInvoice paymentMethodPerSaleInvoice);
}
