package com.ritallus.dailybookapi.auth.infraestructure.database.jpa;

import com.ritallus.dailybookapi.auth.infraestructure.database.jpa.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepositoryJpa extends JpaRepository<UserEntity, Long> {

    Optional<UserEntity> findByEmail(String email);
}
