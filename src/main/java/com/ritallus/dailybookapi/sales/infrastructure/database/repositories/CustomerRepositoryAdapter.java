package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.repositories.CustomerRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.CustomerRepositoryJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class CustomerRepositoryAdapter implements CustomerRepositoryPort {

    private final CustomerRepositoryJpa customerRepositoryJpa;

}
