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
public class ProductStock {
    private Long id;
    private Long idCompany;
    private Long idProduct;
    private Product product;
    private Integer quantity;
    private Integer minimumQuantity;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
}
