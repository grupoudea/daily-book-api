package com.ritallus.dailybookapi.security.jwt;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.ritallus.dailybookapi.commons.MessageResponse;
import com.ritallus.dailybookapi.commons.StandardResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;


import java.io.IOException;


@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {

    @Override
    public void commence(HttpServletRequest req, HttpServletResponse response, AuthenticationException e)
            throws IOException, ServletException {

        response.setCharacterEncoding("UTF-8");
        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
        response.setContentType("application/json");
        StandardResponse<String> standardResponse = new StandardResponse<>(
                MessageResponse.AUTHENTICATION_ERROR.getMessage(),
                MessageResponse.AUTHENTICATION_ERROR.getDescription());
        response.getWriter().write(new ObjectMapper().writeValueAsString(standardResponse));
    }
}