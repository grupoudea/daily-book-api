package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.sales.core.services.ports.SupplierPurchaseDetailServicePort;
import com.ritallus.dailybookapi.sales.domain.repositories.SupplierPurchaseDetailRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierPurchaseDetailService implements SupplierPurchaseDetailServicePort {
    private final SupplierPurchaseDetailRepositoryPort repository;

}