package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.models.SupplierPurchase;
import com.ritallus.dailybookapi.sales.domain.repositories.SupplierPurchaseRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.SupplierPurchaseRepositoryJpa;
import com.ritallus.dailybookapi.sales.infrastructure.mappers.SupplierPurchaseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SupplierPurchaseRepositoryAdapter implements SupplierPurchaseRepositoryPort {

    private final SupplierPurchaseRepositoryJpa supplierPurchaseRepositoryJpa;
    private final SupplierPurchaseMapper mapper;

    @Override
    public SupplierPurchase save(SupplierPurchase supplierPurchase) {
        return mapper.toModel(supplierPurchaseRepositoryJpa.save(mapper.toEntity(supplierPurchase)));
    }
}
