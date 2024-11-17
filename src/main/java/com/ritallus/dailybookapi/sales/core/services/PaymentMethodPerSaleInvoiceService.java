package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.sales.core.services.ports.PaymentMethodPerSaleInvoiceServicePort;
import com.ritallus.dailybookapi.sales.domain.repositories.PaymentMethodPerSaleInvoiceRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@RequiredArgsConstructor
public class PaymentMethodPerSaleInvoiceService implements PaymentMethodPerSaleInvoiceServicePort {
    private final PaymentMethodPerSaleInvoiceRepositoryPort repository;

}