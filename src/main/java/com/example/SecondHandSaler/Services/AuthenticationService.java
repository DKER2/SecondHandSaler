package com.example.SecondHandSaler.Services;

import com.example.SecondHandSaler.Payload.exceptions.AuthenticationException;
import com.example.SecondHandSaler.Payload.requests.AuthenticationRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private UserService userService;
    private JWTService jwtService;
    public String authenticate(AuthenticationRequest authenticationRequest) throws AuthenticationException {
        String username = authenticationRequest.username;
        if (userService.usernameExists(username)) {
            return jwtService.generateToken(username);
        } else {
            throw new AuthenticationException("User is not authenticated");
        }
    }
}
