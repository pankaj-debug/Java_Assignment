package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.example.demo.Model.Posts;
import com.example.demo.UserRepository.CreateRepository;

public class CreatePostImpl implements CreatePost{
	@Autowired
    private CreateRepository createRepository;
	
	@Qualifier
	private Posts posts;
		
	public Posts save(Posts posts) {
		return createRepository.save(posts);
    }
}