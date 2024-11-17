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
public class ProductStockDetail {
    private Long id;
    private Long idProductStock;
    private ProductStock productStock;
    private Long idRegisteredBy;
    private Long idReference;
    private String referenceType;
    private String notes;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
}
