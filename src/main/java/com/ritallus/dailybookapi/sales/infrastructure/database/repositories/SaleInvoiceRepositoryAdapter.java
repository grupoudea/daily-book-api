package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.models.SaleInvoice;
import com.ritallus.dailybookapi.sales.domain.repositories.SaleInvoiceRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.SaleInvoiceRepositoryJpa;
import com.ritallus.dailybookapi.sales.infrastructure.mappers.SaleInvoiceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SaleInvoiceRepositoryAdapter implements SaleInvoiceRepositoryPort {

    private final SaleInvoiceRepositoryJpa saleInvoiceRepositoryJpa;
    private final SaleInvoiceMapper saleInvoiceMapper;

    @Override
    public SaleInvoice save(SaleInvoice saleInvoice) {
        return saleInvoiceMapper.toModel(saleInvoiceRepositoryJpa.save(saleInvoiceMapper.toEntity(saleInvoice)));
    }
}
