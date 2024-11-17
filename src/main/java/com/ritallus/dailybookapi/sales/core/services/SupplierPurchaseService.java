package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.sales.core.services.ports.SupplierPurchaseServicePort;
import com.ritallus.dailybookapi.sales.domain.repositories.SupplierPurchaseRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierPurchaseService implements SupplierPurchaseServicePort {
    private final SupplierPurchaseRepositoryPort repository;

}