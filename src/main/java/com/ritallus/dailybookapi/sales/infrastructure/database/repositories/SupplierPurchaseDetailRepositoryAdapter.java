package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.models.SupplierPurchaseDetail;
import com.ritallus.dailybookapi.sales.domain.repositories.SupplierPurchaseDetailRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.SupplierPurchaseDetailRepositoryJpa;
import com.ritallus.dailybookapi.sales.infrastructure.mappers.SupplierPurchaseDetailMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SupplierPurchaseDetailRepositoryAdapter implements SupplierPurchaseDetailRepositoryPort {

    private final SupplierPurchaseDetailRepositoryJpa supplierPurchaseDetailRepositoryJpa;
    private final SupplierPurchaseDetailMapper mapper;

    @Override
    public SupplierPurchaseDetail save(SupplierPurchaseDetail supplierPurchaseDetail) {
        return mapper.toModel(supplierPurchaseDetailRepositoryJpa.save(mapper.toEntity(supplierPurchaseDetail)));
    }
}
