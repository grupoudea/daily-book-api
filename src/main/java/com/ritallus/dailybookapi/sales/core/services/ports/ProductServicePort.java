package com.ritallus.dailybookapi.sales.core.services.ports;

import com.ritallus.dailybookapi.sales.domain.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductServicePort {
    Page<Product> getProductsPage(Pageable pageable);

}
