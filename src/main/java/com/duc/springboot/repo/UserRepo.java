package com.duc.springboot.repo;

import com.duc.springboot.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity,Integer> {
    UserEntity findUserEntityByUsername(String username);
}
