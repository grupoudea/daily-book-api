package com.ritallus.dailybookapi.auth.core.services.ports;

import com.ritallus.dailybookapi.auth.domain.models.UserRole;

public interface UserRoleServicePort {
    UserRole save(UserRole userRole);
}
