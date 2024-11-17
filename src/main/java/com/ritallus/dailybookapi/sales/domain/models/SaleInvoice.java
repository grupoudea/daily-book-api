package com.ritallus.dailybookapi.sales.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class SaleInvoice {
    private Long id;
    private Long idCompany;
    private Long idCustomer;
    private Customer customer;
    private Long idEmployee;
    private String customerIdentification;
    private String customerNames;
    private String employeeIdentification;
    private String employeeNames;
    private String invoiceNumber;
    private LocalDateTime invoiceDate;
    private Double total;
    private Double subtotal;
    private Double totalTaxes;
    private Double totalDiscounts;
    private String status;
    private String notes;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
}
