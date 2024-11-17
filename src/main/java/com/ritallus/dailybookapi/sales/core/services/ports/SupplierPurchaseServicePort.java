package com.ritallus.dailybookapi.sales.core.services.ports;

import com.ritallus.dailybookapi.sales.core.dtos.CreateSupplierPurchaseRequest;
import com.ritallus.dailybookapi.sales.domain.models.SupplierPurchase;

public interface SupplierPurchaseServicePort {
    SupplierPurchase createPurchase(CreateSupplierPurchaseRequest request);
}
