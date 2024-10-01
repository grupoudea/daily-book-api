package com.ritallus.dailybookapi.auth.infraestructure.controllers;

import com.ritallus.dailybookapi.auth.core.services.ports.UserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    private final UserServicePort userServicePort;

}
