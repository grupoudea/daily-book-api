package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.repositories.SupplierPurchaseDetailRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.SupplierPurchaseDetailRepositoryJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SupplierPurchaseDetailRepositoryAdapter implements SupplierPurchaseDetailRepositoryPort {

    private final SupplierPurchaseDetailRepositoryJpa supplierPurchaseDetailRepositoryJpa;

}
