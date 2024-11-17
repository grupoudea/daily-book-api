package com.ritallus.dailybookapi.sales.infrastructure.database.repositories;

import com.ritallus.dailybookapi.sales.domain.models.SaleInvoiceDetail;
import com.ritallus.dailybookapi.sales.domain.repositories.SaleInvoiceDetailRepositoryPort;
import com.ritallus.dailybookapi.sales.infrastructure.database.jpa.SaleInvoiceDetailRepositoryJpa;
import com.ritallus.dailybookapi.sales.infrastructure.mappers.SaleInvoiceDetailMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class SaleInvoiceDetailRepositoryAdapter implements SaleInvoiceDetailRepositoryPort {

    private final SaleInvoiceDetailRepositoryJpa saleInvoiceDetailRepositoryJpa;
    private final SaleInvoiceDetailMapper mapper;

    @Override
    public SaleInvoiceDetail save(SaleInvoiceDetail saleInvoiceDetail) {
        return mapper.toModel(saleInvoiceDetailRepositoryJpa.save(mapper.toEntity(saleInvoiceDetail)));
    }
}
