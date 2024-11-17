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
public class SupplierPurchase {
    private Long id;
    private Long idCompany;
    private Long idSupplier;
    private Supplier supplier;
    private String invoiceNumber;
    private LocalDateTime invoiceDate;
    private Double total;
    private Double subtotal;
    private Double totalTaxes;
    private Double totalDiscounts;
    private Long idPaymentMethod;
    private Long idReceivedBy;
    private Long idPaidBy;
    private String status;
    private String notes;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
}
