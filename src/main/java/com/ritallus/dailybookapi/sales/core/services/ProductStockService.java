package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.sales.core.services.ports.ProductStockServicePort;
import com.ritallus.dailybookapi.sales.domain.models.Product;
import com.ritallus.dailybookapi.sales.domain.models.ProductStock;
import com.ritallus.dailybookapi.sales.domain.models.ProductStockDetail;
import com.ritallus.dailybookapi.sales.domain.repositories.ProductStockRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductStockService implements ProductStockServicePort {
    private final ProductStockRepositoryPort repository;

    @Override
    public ProductStock update(ProductStock productStock) {
        productStock.setCreatedDate(LocalDateTime.now());
        productStock.setLastUpdate(LocalDateTime.now());
        return repository.save(productStock);
    }

    public ProductStock save(ProductStock productStock) {
        productStock.setCreatedDate(LocalDateTime.now());
        productStock.setLastUpdate(LocalDateTime.now());
        return repository.save(productStock);
    }
}