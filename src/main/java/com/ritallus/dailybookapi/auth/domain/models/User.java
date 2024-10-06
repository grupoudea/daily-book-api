package com.ritallus.dailybookapi.auth.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class User {
    private Long id;
    private String email;
    private String username;
    private String password;
    private String name;
    private String lastname;
    private String status;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
    private LocalDateTime lastLogin;
    private List<Role> roles;
}
