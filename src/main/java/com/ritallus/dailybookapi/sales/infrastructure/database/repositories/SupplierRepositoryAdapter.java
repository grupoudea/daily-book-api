package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.repositories.SupplierRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.SupplierRepositoryJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SupplierRepositoryAdapter implements SupplierRepositoryPort {

    private final SupplierRepositoryJpa supplierRepositoryJpa;

}
