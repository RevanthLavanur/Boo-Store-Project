package com.capg.bookstore.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.capg.bookstore.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}