package com.ritallus.dailybookapi.auth.infraestructure.controllers;

import com.ritallus.dailybookapi.auth.core.dtos.CreateUserRequest;
import com.ritallus.dailybookapi.auth.core.dtos.UserRegisterRequest;
import com.ritallus.dailybookapi.auth.core.services.ports.UserServicePort;
import com.ritallus.dailybookapi.auth.domain.models.User;
import com.ritallus.dailybookapi.commons.StandardResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServicePort userServicePort;

    @PostMapping("/register")
    @Operation(summary = "Register user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Data created successfully"),
            @ApiResponse(responseCode = "400", description = "The request is invalid"),
            @ApiResponse(responseCode = "500", description = "Internal error processing response"),
    })
    public ResponseEntity<StandardResponse<User>> register(@RequestBody UserRegisterRequest request) {
        var user = userServicePort.register(request);
        return ResponseEntity.ok(new StandardResponse<>(user));
    }

    @Secured({"ROLE_SUPER_USER", "ROLE_SYSTEM_MANAGER"})
    @PostMapping("/create-user")
    @Operation(summary = "Create user")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Data created successfully"),
            @ApiResponse(responseCode = "400", description = "The request is invalid"),
            @ApiResponse(responseCode = "500", description = "Internal error processing response"),
    })
    public ResponseEntity<StandardResponse<User>> createUser(@RequestBody CreateUserRequest request) {
        var user = userServicePort.createUser(request);
        return ResponseEntity.ok(new StandardResponse<>(user));
    }
}
