package com.ritallus.dailybookapi.security.jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ritallus.dailybookapi.auth.core.dtos.UserAuthRequest;
import com.ritallus.dailybookapi.security.Constants;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import java.io.IOException;
import java.util.Collections;

public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) {
        UserAuthRequest userAuthRequest = new UserAuthRequest();
        try {
            userAuthRequest = new ObjectMapper().readValue(request.getReader(), UserAuthRequest.class);
        } catch (Exception e) {

        }
        UsernamePasswordAuthenticationToken userPAT = new UsernamePasswordAuthenticationToken(
                userAuthRequest.getEmail(), userAuthRequest.getPassword(), Collections.emptyList()
        );
        return getAuthenticationManager().authenticate(userPAT);
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
                                            Authentication authResult) throws IOException, ServletException {
        String token = TokenUtils.generateToken(authResult);
        response.addHeader(Constants.AUTHORIZATION, Constants.BEARER + token);
        response.getWriter().flush();
        super.successfulAuthentication(request, response, chain, authResult);
    }
}
