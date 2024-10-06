package com.ritallus.dailybookapi.auth.domain.repositories;

import com.ritallus.dailybookapi.auth.domain.models.UserRole;

public interface UserRoleRepositoryPort {
    UserRole save(UserRole userRole);
}
