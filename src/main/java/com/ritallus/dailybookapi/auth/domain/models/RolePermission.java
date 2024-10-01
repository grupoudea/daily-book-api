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
public class RolePermission {
    private Long id;
    private Long idRole;
    private Role role;
    private Long idPermission;
    private Permission permission;
    private LocalDateTime createdDate;
    private LocalDateTime lastUpdate;
}
