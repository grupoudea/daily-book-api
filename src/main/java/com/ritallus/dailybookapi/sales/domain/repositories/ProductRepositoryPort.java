package com.ritallus.dailybookapi.sales.domain.repositories;

import com.ritallus.dailybookapi.sales.domain.models.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductRepositoryPort {
    Page<Product> getProductsPage(Pageable pageable);

}
