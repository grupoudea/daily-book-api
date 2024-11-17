package com.ritallus.dailybookapi.sales.infrastructure.database.jpa;

import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities.ProductStockEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStockRepositoryJpa extends JpaRepository<ProductStockEntity, Long> {

}
