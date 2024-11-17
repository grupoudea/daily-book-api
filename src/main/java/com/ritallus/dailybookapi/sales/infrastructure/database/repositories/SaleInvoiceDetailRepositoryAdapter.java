package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.repositories.SaleInvoiceDetailRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.SaleInvoiceDetailRepositoryJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SaleInvoiceDetailRepositoryAdapter implements SaleInvoiceDetailRepositoryPort {

    private final SaleInvoiceDetailRepositoryJpa saleInvoiceDetailRepositoryJpa;

}
