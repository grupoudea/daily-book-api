package com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "suppliers")
@Entity
@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class SupplierEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", length = 16)
    private Long id;

    @Column(name = "id_company", nullable = false)
    private Long idCompany;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "business_name")
    private String businessName;

    @Column(name = "id_person_type", nullable = false)
    private Long idPersonType;

    @Column(name = "nit")
    private String nit;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;

    @Column(name = "id_city", nullable = false)
    private Long idCity;

    @Column(name = "website")
    private String webSite;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "create_date", nullable = false)
    private LocalDateTime createdDate;

    @Column(name = "last_update", nullable = false)
    private LocalDateTime lastUpdate;
}
