package com.ritallus.dailybookapi.sales.domain.repositories;

import com.ritallus.dailybookapi.sales.domain.models.ProductStockDetail;

public interface ProductStockDetailRepositoryPort {
    ProductStockDetail save(ProductStockDetail productStockDetail);
}
