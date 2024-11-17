package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.sales.core.services.ports.CustomerServicePort;
import com.ritallus.dailybookapi.sales.domain.models.Customer;
import com.ritallus.dailybookapi.sales.domain.repositories.CustomerRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService implements CustomerServicePort {
    private final CustomerRepositoryPort repository;

    @Override
    public List<Customer> getCustomers() {
        return repository.getCustomers();
    }
}