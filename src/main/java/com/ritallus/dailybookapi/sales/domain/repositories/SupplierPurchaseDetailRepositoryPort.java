package com.ritallus.dailybookapi.sales.domain.repositories;

import com.ritallus.dailybookapi.sales.domain.models.SupplierPurchaseDetail;

public interface SupplierPurchaseDetailRepositoryPort {
    SupplierPurchaseDetail save(SupplierPurchaseDetail supplierPurchaseDetail);
}
