package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.sales.core.services.ports.SupplierPurchaseDetailServicePort;
import com.ritallus.dailybookapi.sales.domain.models.SupplierPurchaseDetail;
import com.ritallus.dailybookapi.sales.domain.repositories.SupplierPurchaseDetailRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierPurchaseDetailService implements SupplierPurchaseDetailServicePort {
    private final SupplierPurchaseDetailRepositoryPort repository;

    @Override
    public SupplierPurchaseDetail save(SupplierPurchaseDetail supplierPurchaseDetail) {
        supplierPurchaseDetail.setCreatedDate(LocalDateTime.now());
        supplierPurchaseDetail.setLastUpdate(LocalDateTime.now());
        return repository.save(supplierPurchaseDetail);
    }
}