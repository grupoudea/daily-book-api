package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.models.Customer;
import com.ritallus.dailybookapi.sales.domain.repositories.CustomerRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.CustomerRepositoryJpa;
import com.ritallus.dailybookapi.sales.infrastructure.mappers.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CustomerRepositoryAdapter implements CustomerRepositoryPort {

    private final CustomerRepositoryJpa customerRepositoryJpa;
    private final CustomerMapper mapper;

    @Override
    public List<Customer> getCustomers() {
        return mapper.toModel(customerRepositoryJpa.getCustomers());
    }
}
