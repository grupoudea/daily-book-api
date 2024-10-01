package com.ritallus.dailybookapi.auth.core.services;


import com.ritallus.dailybookapi.auth.core.dtos.UserAuthDto;
import com.ritallus.dailybookapi.auth.core.dtos.UserAuthRequest;
import com.ritallus.dailybookapi.auth.core.services.ports.AuthenticationServicePort;
import com.ritallus.dailybookapi.auth.core.services.ports.UserServicePort;
import com.ritallus.dailybookapi.auth.domain.models.User;
import com.ritallus.dailybookapi.commons.CustomUtilService;
import com.ritallus.dailybookapi.commons.MessageResponse;
import com.ritallus.dailybookapi.commons.exceptions.BusinessException;
import com.ritallus.dailybookapi.security.jwt.TokenUtils;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

import static com.ritallus.dailybookapi.security.Constants.BEARER;

@Service
@Transactional
@RequiredArgsConstructor
public class AuthenticationService implements AuthenticationServicePort {
    private final UserServicePort userServicePort;
    private final AuthenticationManager authenticationManager;

    public UserAuthDto authentication(UserAuthRequest request) {
        CustomUtilService.ValidateRequired(request);
        CustomUtilService.ValidateRequired(request.getEmail());
        CustomUtilService.ValidateRequired(request.getPassword());
        User user = userServicePort.findByEmail(request.getEmail());

        if (!user.getStatus().equals("ACTIVE")) {
            throw new BusinessException(MessageResponse.USER_NOT_ACTIVE);
        }

        Authentication authentication = this.authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        final var jwt = TokenUtils.generateToken(authentication);

        UserAuthDto userAuth = new UserAuthDto();
        userAuth.setTokenType(BEARER);
        userAuth.setToken(jwt);

        user.setLastLogin(LocalDateTime.now());
        userServicePort.update(user);
        return userAuth;
    }
}