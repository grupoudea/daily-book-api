package com.ritallus.dailybookapi.auth.core.services.ports;

import com.ritallus.dailybookapi.auth.core.dtos.UserAuthDto;
import com.ritallus.dailybookapi.auth.core.dtos.UserAuthRequest;

public interface AuthenticationServicePort {
    UserAuthDto authentication(UserAuthRequest request);
}
