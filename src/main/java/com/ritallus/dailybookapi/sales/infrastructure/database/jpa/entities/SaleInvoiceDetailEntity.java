package com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "sales_invoices_details")
@Entity
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class SaleInvoiceDetailEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 16)
    private Long id;

    @Column(name = "id_sale_invoice", nullable = false)
    private Long idSaleInvoice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sale_invoice", insertable = false, updatable = false)
    private SaleInvoiceEntity saleInvoice;

    @Column(name = "id_product", nullable = false)
    private Long idProduct;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private ProductEntity product;

    @Column(name = "product_name", nullable = false)
    private String productName;

    @Column(name = "product_sku")
    private String productSku;

    @Column(name = "product_measure")
    private String productMeasure;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "unit_price", nullable = false)
    private Double unitPrice;

    @Column(name = "total_price", nullable = false)
    private Double totalPrice;

    @Column(name = "discount")
    private Double discount;

    @Column(name = "total_price_with_discount")
    private Double totalPriceWithDiscount;

    @Column(name = "create_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;
}
