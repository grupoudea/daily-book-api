package com.ritallus.dailybookapi.auth.infraestructure.database.repositories;

import com.ritallus.dailybookapi.auth.domain.models.User;
import com.ritallus.dailybookapi.auth.domain.repositories.UserRepositoryPort;
import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.UserRepositoryJpa;
import com.ritallus.dailybookapi.auth.infraestructure.mappers.UserMapper;
import com.ritallus.dailybookapi.commons.MessageResponse;
import com.ritallus.dailybookapi.commons.exceptions.DataDuplicateException;
import com.ritallus.dailybookapi.commons.exceptions.DataNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class UserRepositoryAdapter implements UserRepositoryPort {

    private final UserRepositoryJpa userRepositoryJpa;
    private final UserMapper userMapper;

    public Optional<User> findByEmail(String email) {
        return Optional.ofNullable(userMapper.toModel(userRepositoryJpa.findByEmail(email).orElseThrow(() ->
                new DataNotFoundException(MessageResponse.USER_NOT_FOUND_EXCEPTION))));
    }

    public void validateExistsEmail(String email) {
        userRepositoryJpa.findByEmail(email)
                .ifPresent(user -> {
                    throw new DataDuplicateException(MessageResponse.USER_ALREADY_EXISTS);
                });
    }

    public User save(User user) {
        return userMapper.toModel(userRepositoryJpa.save(userMapper.toEntity(user)));
    }
}
