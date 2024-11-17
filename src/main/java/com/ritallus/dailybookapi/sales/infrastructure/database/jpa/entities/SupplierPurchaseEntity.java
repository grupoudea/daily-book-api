package com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "suppliers_purchases")
@Entity
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class SupplierPurchaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 16)
    private Long id;

    @Column(name = "id_company", nullable = false)
    private Long idCompany;

    @Column(name = "id_supplier", nullable = false)
    private Long idSupplier;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_supplier", insertable = false, updatable = false)
    private SupplierEntity supplier;

    @Column(name = "invoice_number")
    private String invoiceNumber;

    @Column(name = "invoice_date")
    private LocalDateTime invoiceDate;

    @Column(name = "total", nullable = false)
    private Double total;

    @Column(name = "subtotal", nullable = false)
    private Double subtotal;

    @Column(name = "total_taxes")
    private Double totalTaxes;

    @Column(name = "total_discounts")
    private Double totalDiscounts;

    @Column(name = "id_payment_method")
    private Long idPaymentMethod;

    @Column(name = "id_received_by", nullable = false)
    private Long idReceivedBy;

    @Column(name = "id_paid_by", nullable = false)
    private Long idPaidBy;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "notes")
    private String notes;

    @Column(name = "create_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;
}
