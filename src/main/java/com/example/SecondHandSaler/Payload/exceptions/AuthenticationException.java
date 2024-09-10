package com.example.SecondHandSaler.Payload.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class AuthenticationException extends ResponseStatusException {
    public AuthenticationException(String message) {
        super(HttpStatus.NOT_ACCEPTABLE, message);
    }
}
