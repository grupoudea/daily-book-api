package com.ritallus.dailybookapi.auth.core.services;


import com.ritallus.dailybookapi.auth.core.services.ports.RoleServicePort;
import com.ritallus.dailybookapi.auth.domain.models.Role;
import com.ritallus.dailybookapi.auth.domain.repositories.RoleRepositoryPort;
import com.ritallus.dailybookapi.commons.MessageResponse;
import com.ritallus.dailybookapi.commons.exceptions.DataNotFoundException;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class RoleService implements RoleServicePort {
    private final RoleRepositoryPort repository;

    public Role findByName(String name) {
        return repository.findByName(name).orElseThrow(() ->
                new DataNotFoundException(MessageResponse.ROLE_NOT_FOUND_EXCEPTION));
    }
}