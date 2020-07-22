package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Bean.Posts;
import com.example.demo.UserRepository.CreateRepository;

public class CreatePostImpl implements CreatePost{
	@Autowired
    private CreateRepository createRepository;
	
	@Override
	public void save(Posts posts) {
		createRepository.save(posts);
    }
}
