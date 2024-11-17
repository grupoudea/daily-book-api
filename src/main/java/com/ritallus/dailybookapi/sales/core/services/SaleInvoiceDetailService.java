package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.sales.core.services.ports.SaleInvoiceDetailServicePort;
import com.ritallus.dailybookapi.sales.domain.repositories.SaleInvoiceDetailRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class SaleInvoiceDetailService implements SaleInvoiceDetailServicePort {
    private final SaleInvoiceDetailRepositoryPort repository;

}