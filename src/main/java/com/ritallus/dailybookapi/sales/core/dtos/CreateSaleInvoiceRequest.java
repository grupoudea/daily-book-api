package com.ritallus.dailybookapi.sales.core.dtos;

import lombok.Data;

@Data
public class CreateSaleInvoiceRequest {
    private Long idCompany;
    private Long idCustomer;
    private Long idProduct;
    private Integer quantity;
}
