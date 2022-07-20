package com.example.demo.repository;

import com.example.demo.model.Role;
import com.example.demo.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(UserRole roleName);
}
