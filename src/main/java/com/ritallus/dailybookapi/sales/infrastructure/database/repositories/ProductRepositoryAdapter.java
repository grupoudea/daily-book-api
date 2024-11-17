package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.repositories.ProductRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.ProductRepositoryJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class ProductRepositoryAdapter implements ProductRepositoryPort {

    private final ProductRepositoryJpa productRepositoryJpa;

}
