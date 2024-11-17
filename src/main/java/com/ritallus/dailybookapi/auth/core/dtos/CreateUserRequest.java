package com.ritallus.dailybookapi.auth.core.dtos;

import lombok.Data;

import java.util.List;

@Data
public class CreateUserRequest {
    private String email;
    private String username;
    private String name;
    private String lastname;
    private String password;
    private List<Long> rolesId;

}
