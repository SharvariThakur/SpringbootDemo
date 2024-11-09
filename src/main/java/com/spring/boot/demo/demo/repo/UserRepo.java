package com.spring.boot.demo.demo.repo;

import com.spring.boot.demo.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer> {

    Users findByUsername(String username);
}
