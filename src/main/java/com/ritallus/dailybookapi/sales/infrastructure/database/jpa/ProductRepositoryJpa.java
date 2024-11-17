package com.ritallus.dailybookapi.sales.infrastructure.database.jpa;

import com.ritallus.dailybookapi.sales.domain.models.Product;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepositoryJpa extends JpaRepository<ProductEntity, Long> {

    @Query(value = "SELECT new com.ritallus.dailybookapi.sales.domain.models.Product(" +
            "p.id, p.idCompany, p.name, p.description, p.sku, p.barcode, p.idMeasureUnit, p.measure," +
            "p.idDiscount, p.hasDiscount, p.createdDate, p.lastUpdate) " +
            "FROM ProductEntity p " +
            "JOIN ProductStockEntity ps ON p.id = ps.idProduct " +
            "WHERE p.idCompany = 1 " +
            "AND p.id = 1 "
    )
    Page<Product> getProductsPage(Pageable pageable);
}
