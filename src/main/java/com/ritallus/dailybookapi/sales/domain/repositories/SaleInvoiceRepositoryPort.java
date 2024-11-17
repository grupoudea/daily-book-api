package com.ritallus.dailybookapi.sales.domain.repositories;

import com.ritallus.dailybookapi.sales.core.dtos.SaleInvoiceReportResponse;
import com.ritallus.dailybookapi.sales.domain.models.SaleInvoice;

import java.util.List;

public interface SaleInvoiceRepositoryPort {

    SaleInvoice save(SaleInvoice saleInvoice);

    List<SaleInvoiceReportResponse> getDailyReport();
}
