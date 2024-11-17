package com.ritallus.dailybookapi.security;

import com.ritallus.dailybookapi.auth.core.services.ports.UserServicePort;
import com.ritallus.dailybookapi.auth.domain.models.Role;
import com.ritallus.dailybookapi.auth.domain.models.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static com.ritallus.dailybookapi.commons.Constants.ROLE_PREFIX;


@Service
@RequiredArgsConstructor
public class UserAuthService implements UserDetailsService {

    private final UserServicePort userService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User userWithRoles = userService.findByEmail(email);
        Set<String> roles = userWithRoles.getRoles().stream().map(Role::getName).collect(Collectors.toSet());
        return new org.springframework.security.core.userdetails.User(
                userWithRoles.getEmail(),
                userWithRoles.getPassword(),
                getAuthorities(roles));
    }

    private Collection<? extends GrantedAuthority> getAuthorities(Collection<String> roles) {
        List<GrantedAuthority> authorities = new ArrayList<>();
        for (String role : roles) {
            authorities.add(new SimpleGrantedAuthority(ROLE_PREFIX + role));
        }
        return authorities;
    }
}
