package com.ritallus.dailybookapi.auth.core.services.ports;

import com.ritallus.dailybookapi.auth.domain.models.User;

public interface UserServicePort {

    User findByEmail(String email);

    User update(User user);
}
