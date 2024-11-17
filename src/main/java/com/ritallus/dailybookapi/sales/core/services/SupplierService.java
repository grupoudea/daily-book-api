package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.sales.core.services.ports.SupplierServicePort;
import com.ritallus.dailybookapi.sales.domain.repositories.SupplierRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierService implements SupplierServicePort {
    private final SupplierRepositoryPort repository;

}