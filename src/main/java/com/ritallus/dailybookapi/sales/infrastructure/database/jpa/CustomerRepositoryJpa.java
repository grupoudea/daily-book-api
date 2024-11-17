package com.ritallus.dailybookapi.sales.infrastructure.database.jpa;

import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepositoryJpa extends JpaRepository<CustomerEntity, Long> {

}
