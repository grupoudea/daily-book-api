package com.ritallus.dailybookapi.auth.core.dtos;

import lombok.Data;

@Data
public class UserAuthDto {
    private String token;
    private String tokenType;
}
