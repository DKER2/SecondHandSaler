package com.example.SecondHandSaler.Services;

import com.example.SecondHandSaler.Entities.UserEntity;
import com.example.SecondHandSaler.Repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    public void createUser(UserEntity userEntity) {
        userRepository.save(userEntity);
    }

}
