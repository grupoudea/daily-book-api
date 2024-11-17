package com.ritallus.dailybookapi.sales.infrastructure.database.jpa;

import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities.ProductStockDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductStockDetailRepositoryJpa extends JpaRepository<ProductStockDetailEntity, Long> {

}
