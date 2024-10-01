package com.ritallus.dailybookapi.auth.core.services;


import com.ritallus.dailybookapi.auth.core.services.ports.PermissionServicePort;
import com.ritallus.dailybookapi.auth.domain.repositories.PermissionRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class PermissionService implements PermissionServicePort {
    private final PermissionRepositoryPort repository;

}