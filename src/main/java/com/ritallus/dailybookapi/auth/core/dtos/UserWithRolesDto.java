package com.ritallus.dailybookapi.auth.core.dtos;

import com.ritallus.dailybookapi.auth.domain.models.Role;
import com.ritallus.dailybookapi.auth.domain.models.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserWithRolesDto {
    private User user;
    private List<Role> roles;
}
