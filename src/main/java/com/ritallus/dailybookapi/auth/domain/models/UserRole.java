package com.ritallus.dailybookapi.auth.domain.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@Builder
@Data
@NoArgsConstructor
public class UserRole {
    private Long id;
    private Long idRole;
    private Role role;
    private Long idUser;
    private User user;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
}
