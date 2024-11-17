package com.ritallus.dailybookapi.sales.core.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SaleInvoiceReportResponse {
    private Double total;
    private LocalDateTime invoiceDate;
}
