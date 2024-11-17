package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.sales.core.services.ports.ProductStockServicePort;
import com.ritallus.dailybookapi.sales.domain.repositories.ProductStockRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductStockService implements ProductStockServicePort {
    private final ProductStockRepositoryPort repository;

}