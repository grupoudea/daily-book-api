package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.commons.CustomUtilService;
import com.ritallus.dailybookapi.sales.core.dtos.CreateSaleInvoiceRequest;
import com.ritallus.dailybookapi.sales.core.services.ports.ProductStockDetailServicePort;
import com.ritallus.dailybookapi.sales.core.services.ports.ProductStockServicePort;
import com.ritallus.dailybookapi.sales.core.services.ports.SaleInvoiceDetailServicePort;
import com.ritallus.dailybookapi.sales.core.services.ports.SaleInvoiceServicePort;
import com.ritallus.dailybookapi.sales.domain.models.ProductStock;
import com.ritallus.dailybookapi.sales.domain.models.ProductStockDetail;
import com.ritallus.dailybookapi.sales.domain.models.SaleInvoice;
import com.ritallus.dailybookapi.sales.domain.models.SaleInvoiceDetail;
import com.ritallus.dailybookapi.sales.domain.repositories.SaleInvoiceRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class SaleInvoiceService implements SaleInvoiceServicePort {
    private final SaleInvoiceRepositoryPort repository;
    private final SaleInvoiceDetailServicePort saleInvoiceDetailServicePort;
    private final ProductStockServicePort productStockServicePort;
    private final ProductStockDetailServicePort productStockDetailServicePort;

    public SaleInvoice createInvoiceSale(CreateSaleInvoiceRequest request) {
        CustomUtilService.ValidateRequired(request.getIdCompany());
        CustomUtilService.ValidateRequired(request.getIdCustomer());
        CustomUtilService.ValidateRequired(request.getIdProduct());
        CustomUtilService.ValidateRequired(request.getQuantity());

        var sale = SaleInvoice.builder()
                .idCompany(request.getIdCompany())
                .idCustomer(request.getIdCustomer())
                .idEmployee(1L)
                .customerIdentification("111222333")
                .customerNames("MARTA")
                .employeeIdentification("444555666")
                .employeeNames("Sandra")
                .invoiceNumber("FA001")
                .invoiceDate(LocalDateTime.now())
                .total(50000.0)
                .subtotal(40000.0)
                .totalTaxes(10000.0)
                .status("CLOSED")
                .build();

        var saleSaved = save(sale);

        var saleInvoiceDetail = SaleInvoiceDetail.builder()
                .idSaleInvoice(saleSaved.getId())
                .idProduct(request.getIdProduct())
                .productName("PANELA")
                .quantity(request.getQuantity())
                .unitPrice(4500.0)
                .totalPrice(45000.0)
                .build();

        var saleDetailSaved = saleInvoiceDetailServicePort.save(saleInvoiceDetail);

        var productStock = ProductStock.builder()
                .id(1L)
                .idCompany(1L)
                .idProduct(request.getIdProduct())
                .quantity(request.getQuantity())
                .minimumQuantity(50)
                .build();

        var productUpdated = productStockServicePort.update(productStock);

        var productStockDetail = ProductStockDetail.builder()
                .idProductStock(productUpdated.getId())
                .idRegisteredBy(1L)
                .idReference(saleDetailSaved.getId())
                .referenceType("SALE_INVOICE")
                .build();

        var productStockDetailSaved = productStockDetailServicePort.save(productStockDetail);

        return saleSaved;
    }

    public SaleInvoice save(SaleInvoice saleInvoice) {
        saleInvoice.setCreatedDate(LocalDateTime.now());
        saleInvoice.setLastUpdate(LocalDateTime.now());
        return repository.save(saleInvoice);
    }
}