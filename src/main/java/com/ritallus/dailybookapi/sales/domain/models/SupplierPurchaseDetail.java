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
public class SupplierPurchaseDetail {
    private Long id;
    private Long idSupplierPurchase;
    private SupplierPurchase supplierPurchase;
    private Long idProduct;
    private Product product;
    private Integer quantity;
    private Double unitPrice;
    private Double totalPrice;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
}
