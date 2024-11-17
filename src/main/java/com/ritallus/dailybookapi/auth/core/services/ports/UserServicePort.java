package com.ritallus.dailybookapi.auth.core.services.ports;

import com.ritallus.dailybookapi.auth.core.dtos.CreateUserRequest;
import com.ritallus.dailybookapi.auth.core.dtos.UserRegisterRequest;
import com.ritallus.dailybookapi.auth.domain.models.User;

public interface UserServicePort {

    User findByEmail(String email);

    User update(User user);

    User register(UserRegisterRequest request);

    User createUser(CreateUserRequest request);
}
