package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.sales.core.services.ports.PaymentMethodPerSaleInvoiceServicePort;
import com.ritallus.dailybookapi.sales.domain.models.PaymentMethodPerSaleInvoice;
import com.ritallus.dailybookapi.sales.domain.repositories.PaymentMethodPerSaleInvoiceRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class PaymentMethodPerSaleInvoiceService implements PaymentMethodPerSaleInvoiceServicePort {
    private final PaymentMethodPerSaleInvoiceRepositoryPort repository;

    @Override
    public PaymentMethodPerSaleInvoice save(PaymentMethodPerSaleInvoice paymentMethodPerSaleInvoice) {
        paymentMethodPerSaleInvoice.setCreatedDate(LocalDateTime.now());
        paymentMethodPerSaleInvoice.setLastUpdate(LocalDateTime.now());
        return repository.save(paymentMethodPerSaleInvoice);
    }
}