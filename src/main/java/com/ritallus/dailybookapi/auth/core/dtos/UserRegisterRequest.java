package com.ritallus.dailybookapi.auth.core.dtos;

import lombok.Data;

@Data
public class UserRegisterRequest {
    private String email;
    private String name;
    private String lastname;
    private String password;

    //TODO: Agregar empresa
}
