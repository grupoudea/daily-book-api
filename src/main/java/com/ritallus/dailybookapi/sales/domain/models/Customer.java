package com.ritallus.dailybookapi.sales.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class Customer {
    private Long id;
    private Long idCompany;
    private String identificationNumber;
    private Long idIdentificationType;
    private String firsName;
    private String lastName;
    private String phone;
    private String email;
    private Date birthDate;
    private String address;
    private Long idCity;
    private Boolean acceptTerms;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
}
