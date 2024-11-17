package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.repositories.SaleInvoiceRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.SaleInvoiceRepositoryJpa;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SaleInvoiceRepositoryAdapter implements SaleInvoiceRepositoryPort {

    private final SaleInvoiceRepositoryJpa saleInvoiceRepositoryJpa;

}
