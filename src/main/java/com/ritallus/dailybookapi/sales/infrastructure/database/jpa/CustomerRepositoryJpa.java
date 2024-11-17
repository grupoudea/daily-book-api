package com.ritallus.dailybookapi.sales.infrastructure.database.jpa;

import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepositoryJpa extends JpaRepository<CustomerEntity, Long> {

    @Query(value = "SELECT c " +
            "FROM CustomerEntity c " +
            "WHERE c.idCompany = 1 " +
            "AND c.id = 2 "
    )
    List<CustomerEntity> getCustomers();
}
