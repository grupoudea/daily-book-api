package com.ritallus.dailybookapi.auth.core.services.ports;

import com.ritallus.dailybookapi.auth.domain.models.Role;

public interface RoleServicePort {

    Role findByName(String name);
}
