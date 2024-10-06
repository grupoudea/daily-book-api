package com.ritallus.dailybookapi.commons;

public class Constants {
    public static final String BEARER = "Bearer ";
    public static final String AUTHORIZATION = "Authorization";
    public static final String ROLE_PREFIX = "ROLE_";
    public static final String ROLE_SUPER_USER = "SUPER_USER";

    public enum UserStatus {
        ACTIVE,
        INACTIVE;
    }
}
