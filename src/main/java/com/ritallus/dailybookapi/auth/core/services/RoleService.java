package com.ritallus.dailybookapi.auth.core.services;


import com.ritallus.dailybookapi.auth.core.services.ports.RoleServicePort;
import com.ritallus.dailybookapi.auth.domain.repositories.RoleRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class RoleService implements RoleServicePort {
    private final RoleRepositoryPort repository;

}