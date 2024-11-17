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
public class Supplier {
    private Long id;
    private Long idCompany;
    private String name;
    private String businessName;
    private Long idPersonType;
    private String nit;
    private String phone;
    private String email;
    private String address;
    private Long idCity;
    private String webSite;
    private String status;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
}
