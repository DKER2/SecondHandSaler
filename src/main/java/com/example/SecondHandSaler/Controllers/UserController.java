package com.example.SecondHandSaler.Controllers;

import com.example.SecondHandSaler.Entities.UserEntity;
import com.example.SecondHandSaler.Services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserController {
    private UserService userService;

    @PutMapping("/createUser")
    public void createUser(@RequestBody UserEntity userEntity) {
        userService.createUser(userEntity);
    }
}
