package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.models.ProductStockDetail;
import com.ritallus.dailybookapi.sales.domain.repositories.ProductStockDetailRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.ProductStockDetailRepositoryJpa;
import com.ritallus.dailybookapi.sales.infrastructure.mappers.ProductStockDetailMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductStockDetailRepositoryAdapter implements ProductStockDetailRepositoryPort {

    private final ProductStockDetailRepositoryJpa productStockDetailRepositoryJpa;
    private final ProductStockDetailMapper mapper;

    @Override
    public ProductStockDetail save(ProductStockDetail productStockDetail) {
        return mapper.toModel(productStockDetailRepositoryJpa.save(mapper.toEntity(productStockDetail)));
    }
}
