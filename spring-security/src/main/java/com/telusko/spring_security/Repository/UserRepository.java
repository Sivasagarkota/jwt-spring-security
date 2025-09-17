package com.telusko.spring_security.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.telusko.spring_security.Model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
