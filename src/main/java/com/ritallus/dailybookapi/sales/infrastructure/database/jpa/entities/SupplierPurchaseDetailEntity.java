package com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "suppliers_purchases_details")
@Entity
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class SupplierPurchaseDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 16)
    private Long id;

    @Column(name = "id_supplier_purchase", nullable = false)
    private Long idSupplierPurchase;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_supplier_purchase", insertable = false, updatable = false)
    private SupplierPurchaseEntity supplierPurchase;

    @Column(name = "id_product", nullable = false)
    private Long idProduct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private ProductEntity product;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "unit_price", nullable = false)
    private Double unitPrice;

    @Column(name = "total_price", nullable = false)
    private Double totalPrice;

    @Column(name = "create_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;
}
