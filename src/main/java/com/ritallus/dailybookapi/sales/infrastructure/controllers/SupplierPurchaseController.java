package com.ritallus.dailybookapi.sales.infrastructure.controllers;

import com.ritallus.dailybookapi.commons.StandardResponse;
import com.ritallus.dailybookapi.sales.core.dtos.CreateSupplierPurchaseRequest;
import com.ritallus.dailybookapi.sales.core.services.ports.SupplierPurchaseServicePort;
import com.ritallus.dailybookapi.sales.domain.models.SupplierPurchase;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchases")
@RequiredArgsConstructor
public class SupplierPurchaseController {

    private final SupplierPurchaseServicePort supplierPurchaseServicePort;

    @PostMapping("/create-purchase")
    @Operation(summary = "Create purchase")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Data created successfully"),
            @ApiResponse(responseCode = "400", description = "The request is invalid"),
            @ApiResponse(responseCode = "500", description = "Internal error processing response"),
    })
    public ResponseEntity<StandardResponse<SupplierPurchase>> createPurchase(@RequestBody CreateSupplierPurchaseRequest request) {
        var result = supplierPurchaseServicePort.createPurchase(request);
        return ResponseEntity.ok(new StandardResponse<>(result));
    }
}
