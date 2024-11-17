package com.ritallus.dailybookapi.sales.core.services.ports;

import com.ritallus.dailybookapi.sales.domain.models.ProductStockDetail;

public interface ProductStockDetailServicePort {
    ProductStockDetail save(ProductStockDetail productStockDetail);
}
