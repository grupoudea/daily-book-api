package com.ritallus.dailybookapi.sales.core.services.ports;

import com.ritallus.dailybookapi.sales.domain.models.SupplierPurchaseDetail;

public interface SupplierPurchaseDetailServicePort {
    SupplierPurchaseDetail save(SupplierPurchaseDetail supplierPurchaseDetail);
}
