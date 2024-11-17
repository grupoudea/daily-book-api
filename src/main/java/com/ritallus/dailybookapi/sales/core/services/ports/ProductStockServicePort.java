package com.ritallus.dailybookapi.sales.core.services.ports;

import com.ritallus.dailybookapi.sales.domain.models.ProductStock;

public interface ProductStockServicePort {
    ProductStock update(ProductStock productStock);
}
