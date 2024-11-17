package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.repositories.ProductStockRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.ProductStockRepositoryJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductStockRepositoryAdapter implements ProductStockRepositoryPort {

    private final ProductStockRepositoryJpa productStockRepositoryJpa;

}
