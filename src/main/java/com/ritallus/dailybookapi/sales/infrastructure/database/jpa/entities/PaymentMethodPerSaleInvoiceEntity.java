package com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "payment_methods_per_sales_invoices")
@Entity
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class PaymentMethodPerSaleInvoiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 16)
    private Long id;

    @Column(name = "id_sale_invoice", nullable = false)
    private Long idSaleInvoice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_sale_invoice", insertable = false, updatable = false)
    private SaleInvoiceEntity saleInvoice;

    @Column(name = "id_payment_method", nullable = false)
    private Long idPaymentMethod;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "payment_date", nullable = false)
    private LocalDateTime paymentDate;

    @Column(name = "create_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;
}
