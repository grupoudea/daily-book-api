package com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "products_stock_details")
@Entity
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class ProductStockDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 16)
    private Long id;

    @Column(name = "id_stock_product", nullable = false)
    private Long idProductStock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_stock_product", insertable = false, updatable = false)
    private ProductStockEntity productStock;

    @Column(name = "id_registered_by", nullable = false)
    private Long idRegisteredBy;

    @Column(name = "id_reference")
    private Long idReference;

    @Column(name = "reference_type", length = 50)
    private String referenceType;

    @Column(name = "notes", length = 255)
    private String notes;

    @Column(name = "create_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;
}
