package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.sales.core.services.ports.ProductStockDetailServicePort;
import com.ritallus.dailybookapi.sales.domain.models.ProductStockDetail;
import com.ritallus.dailybookapi.sales.domain.repositories.ProductStockDetailRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductStockDetailService implements ProductStockDetailServicePort {
    private final ProductStockDetailRepositoryPort repository;

    @Override
    public ProductStockDetail save(ProductStockDetail productStockDetail) {
        productStockDetail.setCreatedDate(LocalDateTime.now());
        productStockDetail.setLastUpdate(LocalDateTime.now());
        return repository.save(productStockDetail);
    }
}