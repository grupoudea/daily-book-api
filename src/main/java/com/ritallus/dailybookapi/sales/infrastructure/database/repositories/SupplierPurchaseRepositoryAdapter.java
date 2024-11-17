package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.repositories.SupplierPurchaseRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.SupplierPurchaseRepositoryJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SupplierPurchaseRepositoryAdapter implements SupplierPurchaseRepositoryPort {

    private final SupplierPurchaseRepositoryJpa supplierPurchaseRepositoryJpa;

}
