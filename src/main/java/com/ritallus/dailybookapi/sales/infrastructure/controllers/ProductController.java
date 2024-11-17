package com.ritallus.dailybookapi.sales.infrastructure.controllers;

import com.ritallus.dailybookapi.commons.StandardResponse;
import com.ritallus.dailybookapi.sales.core.services.ports.ProductServicePort;
import com.ritallus.dailybookapi.sales.domain.models.Product;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductServicePort productServicePort;

    @PostMapping("/filter")
    @Operation(summary = "Get Products")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Data searched successfully"),
            @ApiResponse(responseCode = "400", description = "The request is invalid"),
            @ApiResponse(responseCode = "500", description = "Internal error processing response"),
    })
    public ResponseEntity<StandardResponse<Page<Product>>> register(Pageable pageable) {
        var result = productServicePort.getProductsPage(pageable);
        return ResponseEntity.ok(new StandardResponse<>(result));
    }
}
