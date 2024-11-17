package com.ritallus.dailybookapi.sales.domain.repositories;

import com.ritallus.dailybookapi.sales.domain.models.ProductStock;

public interface ProductStockRepositoryPort {
    ProductStock save(ProductStock productStock);
}
