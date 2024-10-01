package com.ritallus.dailybookapi.auth.infraestructure.controllers;

import com.ritallus.dailybookapi.auth.core.dtos.UserAuthDto;
import com.ritallus.dailybookapi.auth.core.dtos.UserAuthRequest;
import com.ritallus.dailybookapi.auth.core.services.ports.AuthenticationServicePort;
import com.ritallus.dailybookapi.auth.core.services.ports.UserServicePort;
import com.ritallus.dailybookapi.commons.StandardResponse;
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
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServicePort userServicePort;
    private final AuthenticationServicePort authenticationServicePort;

    @PostMapping("/authenticate")
    @Operation(summary = "Login")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Data updated successfully"),
            @ApiResponse(responseCode = "400", description = "The request is invalid"),
            @ApiResponse(responseCode = "500", description = "Internal error processing response"),
    })
    public ResponseEntity<StandardResponse<UserAuthDto>> authentication(@RequestBody UserAuthRequest request) {
        var user = authenticationServicePort.authentication(request);
        return ResponseEntity.ok(new StandardResponse<>(user));
    }
}
