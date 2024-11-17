package com.ritallus.dailybookapi.sales.core.services.ports;

import com.ritallus.dailybookapi.sales.core.dtos.CreateSaleInvoiceRequest;
import com.ritallus.dailybookapi.sales.domain.models.SaleInvoice;

public interface SaleInvoiceServicePort {
    SaleInvoice createInvoiceSale(CreateSaleInvoiceRequest request);
}
