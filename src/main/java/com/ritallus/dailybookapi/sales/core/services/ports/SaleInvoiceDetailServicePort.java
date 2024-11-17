package com.ritallus.dailybookapi.sales.core.services.ports;

import com.ritallus.dailybookapi.sales.domain.models.SaleInvoiceDetail;

public interface SaleInvoiceDetailServicePort {
    SaleInvoiceDetail save(SaleInvoiceDetail saleInvoiceDetail);
}
