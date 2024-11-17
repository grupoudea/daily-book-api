package com.ritallus.dailybookapi.sales.domain.repositories;

import com.ritallus.dailybookapi.sales.domain.models.SupplierPurchase;

public interface SupplierPurchaseRepositoryPort {
    SupplierPurchase save(SupplierPurchase supplierPurchase);
}
