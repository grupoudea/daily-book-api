package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.sales.core.services.ports.CustomerServicePort;
import com.ritallus.dailybookapi.sales.domain.repositories.CustomerRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService implements CustomerServicePort {
    private final CustomerRepositoryPort repository;

}