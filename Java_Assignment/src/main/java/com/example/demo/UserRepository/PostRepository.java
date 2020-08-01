package com.example.demo.UserRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Posts;

public interface PostRepository extends JpaRepository<Posts, Long>{	
}