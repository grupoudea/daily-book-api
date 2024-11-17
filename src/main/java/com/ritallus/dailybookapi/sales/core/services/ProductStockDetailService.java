package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.sales.core.services.ports.ProductStockDetailServicePort;
import com.ritallus.dailybookapi.sales.domain.repositories.ProductStockDetailRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductStockDetailService implements ProductStockDetailServicePort {
    private final ProductStockDetailRepositoryPort repository;

}