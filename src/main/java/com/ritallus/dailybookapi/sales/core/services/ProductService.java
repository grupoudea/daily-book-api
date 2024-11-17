package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.sales.core.services.ports.ProductServicePort;
import com.ritallus.dailybookapi.sales.domain.repositories.ProductRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService implements ProductServicePort {
    private final ProductRepositoryPort repository;

}