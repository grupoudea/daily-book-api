package com.ritallus.dailybookapi.sales.domain.repositories;

import com.ritallus.dailybookapi.sales.domain.models.Customer;

import java.util.List;

public interface CustomerRepositoryPort {
    List<Customer> getCustomers();
}
