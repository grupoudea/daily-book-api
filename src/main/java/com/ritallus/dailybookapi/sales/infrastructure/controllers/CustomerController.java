package com.ritallus.dailybookapi.sales.infrastructure.controllers;

import com.ritallus.dailybookapi.commons.StandardResponse;
import com.ritallus.dailybookapi.sales.core.services.ports.CustomerServicePort;
import com.ritallus.dailybookapi.sales.domain.models.Customer;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerServicePort customerServicePort;

    @PostMapping("/filter")
    @Operation(summary = "Get customers")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Data searched successfully"),
            @ApiResponse(responseCode = "400", description = "The request is invalid"),
            @ApiResponse(responseCode = "500", description = "Internal error processing response"),
    })
    public ResponseEntity<StandardResponse<List<Customer>>> getCustomers() {
        var result = customerServicePort.getCustomers();
        return ResponseEntity.ok(new StandardResponse<>(result));
    }
}
