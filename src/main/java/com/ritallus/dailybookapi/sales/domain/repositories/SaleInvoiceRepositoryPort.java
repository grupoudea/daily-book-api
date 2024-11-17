package com.ritallus.dailybookapi.sales.domain.repositories;

import com.ritallus.dailybookapi.sales.domain.models.SaleInvoice;

public interface SaleInvoiceRepositoryPort {

    SaleInvoice save(SaleInvoice saleInvoice);
}
