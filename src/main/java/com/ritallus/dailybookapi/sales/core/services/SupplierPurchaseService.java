package com.ritallus.dailybookapi.sales.core.services;


import com.ritallus.dailybookapi.commons.CustomUtilService;
import com.ritallus.dailybookapi.sales.core.dtos.CreateSupplierPurchaseRequest;
import com.ritallus.dailybookapi.sales.core.services.ports.ProductStockDetailServicePort;
import com.ritallus.dailybookapi.sales.core.services.ports.ProductStockServicePort;
import com.ritallus.dailybookapi.sales.core.services.ports.SupplierPurchaseDetailServicePort;
import com.ritallus.dailybookapi.sales.core.services.ports.SupplierPurchaseServicePort;
import com.ritallus.dailybookapi.sales.domain.models.ProductStock;
import com.ritallus.dailybookapi.sales.domain.models.ProductStockDetail;
import com.ritallus.dailybookapi.sales.domain.models.SupplierPurchase;
import com.ritallus.dailybookapi.sales.domain.models.SupplierPurchaseDetail;
import com.ritallus.dailybookapi.sales.domain.repositories.SupplierPurchaseRepositoryPort;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Transactional
@RequiredArgsConstructor
public class SupplierPurchaseService implements SupplierPurchaseServicePort {
    private final SupplierPurchaseRepositoryPort repository;
    private final SupplierPurchaseDetailServicePort supplierPurchaseDetailServicePort;
    private final ProductStockServicePort productStockServicePort;
    private final ProductStockDetailServicePort productStockDetailServicePort;

    public SupplierPurchase createPurchase(CreateSupplierPurchaseRequest request) {
        CustomUtilService.ValidateRequired(request.getIdCompany());
        CustomUtilService.ValidateRequired(request.getIdSupplier());
        CustomUtilService.ValidateRequired(request.getIdProduct());
        CustomUtilService.ValidateRequired(request.getQuantity());

        var supplierPurchase = SupplierPurchase.builder()
                .idCompany(request.getIdCompany())
                .idSupplier(request.getIdSupplier())
                .invoiceNumber("bb056")
                .invoiceDate(LocalDateTime.now())
                .total(100000.0)
                .subtotal(90000.0)
                .totalTaxes(10000.0)
                .idPaymentMethod(1L)
                .idReceivedBy(1L)
                .idPaidBy(1L)
                .status("CLOSED")
                .build();
        var purchaseSaved = save(supplierPurchase);

        var supplierPurchaseDetail = SupplierPurchaseDetail.builder()
                .idSupplierPurchase(purchaseSaved.getId())
                .idProduct(request.getIdProduct())
                .quantity(request.getQuantity())
                .unitPrice(20000.0)
                .totalPrice(100000.0)
                .build();
        var purchaseDetailSaved = supplierPurchaseDetailServicePort.save(supplierPurchaseDetail);

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
                .idReference(purchaseDetailSaved.getId())
                .referenceType("SUPPLIER_PURCHASE")
                .build();

        var productStockDetailSaved = productStockDetailServicePort.save(productStockDetail);
        return purchaseSaved;
    }

    public SupplierPurchase save(SupplierPurchase supplierPurchase) {
        supplierPurchase.setCreatedDate(LocalDateTime.now());
        supplierPurchase.setLastUpdate(LocalDateTime.now());
        return repository.save(supplierPurchase);
    }
}