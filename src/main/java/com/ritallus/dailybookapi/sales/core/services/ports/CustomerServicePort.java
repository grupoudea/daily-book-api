package com.ritallus.dailybookapi.sales.core.services.ports;

import com.ritallus.dailybookapi.sales.domain.models.Customer;

import java.util.List;

public interface CustomerServicePort {
    List<Customer> getCustomers();
}
