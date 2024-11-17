package com.ritallus.dailybookapi.sales.core.dtos;

import lombok.Data;

@Data
public class CreateSupplierPurchaseRequest {
    private Long idCompany;
    private Long idSupplier;
    private Long idProduct;
    private Integer quantity;
}
