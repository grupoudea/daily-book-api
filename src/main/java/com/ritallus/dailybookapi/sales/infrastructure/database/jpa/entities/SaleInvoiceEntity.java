package com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "sales_invoices")
@Entity
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class SaleInvoiceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 16)
    private Long id;

    @Column(name = "id_company", nullable = false)
    private Long idCompany;

    @Column(name = "id_customer", nullable = false)
    private Long idCustomer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_customer", insertable = false, updatable = false)
    private CustomerEntity customer;

    @Column(name = "id_employee", nullable = false)
    private Long idEmployee;

    @Column(name = "customer_identification")
    private String customerIdentification;

    @Column(name = "customer_names")
    private String customerNames;

    @Column(name = "employee_identification")
    private String employeeIdentification;

    @Column(name = "employee_names")
    private String employeeNames;

    @Column(name = "invoice_number", nullable = false)
    private String invoiceNumber;

    @Column(name = "invoice_date", nullable = false)
    private LocalDateTime invoiceDate;

    @Column(name = "total", nullable = false)
    private Double total;

    @Column(name = "subtotal", nullable = false)
    private Double subtotal;

    @Column(name = "total_taxes")
    private Double totalTaxes;

    @Column(name = "total_discounts")
    private Double totalDiscounts;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "notes")
    private String notes;

    @Column(name = "create_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;
}
