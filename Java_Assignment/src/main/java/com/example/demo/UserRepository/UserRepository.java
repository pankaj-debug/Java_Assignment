package com.example.demo.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Bean.Users;

public interface UserRepository extends JpaRepository<Users, Long>{
}