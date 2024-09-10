package com.example.SecondHandSaler.Repositories;

import com.example.SecondHandSaler.Entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    public boolean existsByUsername(String username);
}
