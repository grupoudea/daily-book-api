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
public class Product {
    private Long id;
    private Long idCompany;
    private String name;
    private String description;
    private String sku;
    private String barcode;
    private Long idMeasureUnit;
    private String measure;
    private Long idDiscount;
    private Boolean hasDiscount;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
}
