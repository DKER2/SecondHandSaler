package com.example.SecondHandSaler.Controllers;

import com.example.SecondHandSaler.Payload.requests.AuthenticationRequest;
import com.example.SecondHandSaler.Services.AuthenticateService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/authenticate")
public class AuthenticateController {
    private final AuthenticateService authenticateService;

    @PostMapping("")
    public String authenticate(@RequestBody AuthenticationRequest authenticationRequest) {
        return authenticateService.authenticate(authenticationRequest);
    }
}
