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
public class SaleInvoiceDetail {
    private Long id;
    private Long idSaleInvoice;
    private SaleInvoice saleInvoice;
    private Long idProduct;
    private Product product;
    private String productName;
    private String productSku;
    private String productMeasure;
    private Integer quantity;
    private Double unitPrice;
    private Double totalPrice;
    private Double discount;
    private Double totalPriceWithDiscount;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
}
