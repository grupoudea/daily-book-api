package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.models.ProductStock;
import com.ritallus.dailybookapi.sales.domain.repositories.ProductStockRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.ProductStockRepositoryJpa;
import com.ritallus.dailybookapi.sales.infrastructure.mappers.ProductStockMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductStockRepositoryAdapter implements ProductStockRepositoryPort {

    private final ProductStockRepositoryJpa productStockRepositoryJpa;
    private final ProductStockMapper mapper;

    @Override
    public ProductStock save(ProductStock productStock) {
        return mapper.toModel(productStockRepositoryJpa.save(mapper.toEntity(productStock)));
    }
}
