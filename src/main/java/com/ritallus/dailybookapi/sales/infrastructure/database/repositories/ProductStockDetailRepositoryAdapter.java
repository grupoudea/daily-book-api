package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.repositories.ProductStockDetailRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.ProductStockDetailRepositoryJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductStockDetailRepositoryAdapter implements ProductStockDetailRepositoryPort {

    private final ProductStockDetailRepositoryJpa productStockDetailRepositoryJpa;

}
