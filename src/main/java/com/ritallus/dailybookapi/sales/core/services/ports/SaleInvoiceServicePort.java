package com.ritallus.dailybookapi.sales.core.services.ports;

import com.ritallus.dailybookapi.sales.core.dtos.CreateSaleInvoiceRequest;
import com.ritallus.dailybookapi.sales.core.dtos.SaleInvoiceReportResponse;
import com.ritallus.dailybookapi.sales.domain.models.SaleInvoice;

import java.util.List;

public interface SaleInvoiceServicePort {
    SaleInvoice createInvoiceSale(CreateSaleInvoiceRequest request);

    List<SaleInvoiceReportResponse> getDailyReport();
}
