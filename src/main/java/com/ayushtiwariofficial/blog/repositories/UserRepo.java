package com.ayushtiwariofficial.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ayushtiwariofficial.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {
    
}
