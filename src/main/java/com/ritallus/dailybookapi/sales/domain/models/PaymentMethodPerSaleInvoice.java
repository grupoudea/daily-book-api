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
public class PaymentMethodPerSaleInvoice {
    private Long id;
    private Long idSaleInvoice;
    private SaleInvoice saleInvoice;
    private Long idPaymentMethod;
    private Double amount;
    private LocalDateTime paymentDate;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
}
