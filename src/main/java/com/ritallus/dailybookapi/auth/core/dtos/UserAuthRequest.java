package com.ritallus.dailybookapi.auth.core.dtos;

import lombok.Data;

@Data
public class UserAuthRequest {
    private String email;
    private String password;
}
