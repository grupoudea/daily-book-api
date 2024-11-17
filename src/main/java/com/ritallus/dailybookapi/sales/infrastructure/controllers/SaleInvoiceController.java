package com.ritallus.dailybookapi.sales.infrastructure.controllers;

import com.ritallus.dailybookapi.commons.StandardResponse;
import com.ritallus.dailybookapi.sales.core.dtos.CreateSaleInvoiceRequest;
import com.ritallus.dailybookapi.sales.core.services.ports.SaleInvoiceServicePort;
import com.ritallus.dailybookapi.sales.domain.models.SaleInvoice;
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
@RequestMapping("/sales")
@RequiredArgsConstructor
public class SaleInvoiceController {

    private final SaleInvoiceServicePort saleInvoiceServicePort;

    @PostMapping("/create-sale")
    @Operation(summary = "Create sale")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Data created successfully"),
            @ApiResponse(responseCode = "400", description = "The request is invalid"),
            @ApiResponse(responseCode = "500", description = "Internal error processing response"),
    })
    public ResponseEntity<StandardResponse<SaleInvoice>> register(@RequestBody CreateSaleInvoiceRequest request) {
        var user = saleInvoiceServicePort.createInvoiceSale(request);
        return ResponseEntity.ok(new StandardResponse<>(user));
    }
}
