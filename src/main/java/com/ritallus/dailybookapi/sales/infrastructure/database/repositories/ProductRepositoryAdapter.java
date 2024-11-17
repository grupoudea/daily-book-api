package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.models.Product;
import com.ritallus.dailybookapi.sales.domain.repositories.ProductRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.ProductRepositoryJpa;
import com.ritallus.dailybookapi.sales.infrastructure.mappers.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryAdapter implements ProductRepositoryPort {

    private final ProductRepositoryJpa productRepositoryJpa;
    private final ProductMapper mapper;

    @Override
    public Page<Product> getProductsPage(Pageable pageable) {
        return productRepositoryJpa.getProductsPage(pageable);
    }
}
