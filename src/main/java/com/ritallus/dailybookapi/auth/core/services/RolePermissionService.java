package com.ritallus.dailybookapi.auth.core.services;


import com.ritallus.dailybookapi.auth.core.services.ports.RolePermissionServicePort;
import com.ritallus.dailybookapi.auth.domain.repositories.RolePermissionRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class RolePermissionService implements RolePermissionServicePort {
    private final RolePermissionRepositoryPort repository;

}