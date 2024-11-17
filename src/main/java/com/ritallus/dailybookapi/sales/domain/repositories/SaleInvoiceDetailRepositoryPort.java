package com.ritallus.dailybookapi.sales.domain.repositories;

import com.ritallus.dailybookapi.sales.domain.models.SaleInvoice;
import com.ritallus.dailybookapi.sales.domain.models.SaleInvoiceDetail;

public interface SaleInvoiceDetailRepositoryPort {

    SaleInvoiceDetail save(SaleInvoiceDetail saleInvoiceDetail);
}
