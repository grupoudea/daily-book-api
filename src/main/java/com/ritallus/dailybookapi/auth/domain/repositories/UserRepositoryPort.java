package com.ritallus.dailybookapi.auth.domain.repositories;

import com.ritallus.dailybookapi.auth.domain.models.User;

import java.util.Optional;

public interface UserRepositoryPort {

    Optional<User> findByEmail(String email);
    User save(User user);
}
