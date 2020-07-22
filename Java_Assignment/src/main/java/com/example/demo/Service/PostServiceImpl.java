package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.Bean.Posts;
import com.example.demo.UserRepository.PostRepository;


public class PostServiceImpl implements PostService {	
	@Autowired
    private PostRepository postRepository;
	
	@Override
    public List < Posts > findAll() {
        return postRepository.findAll();
    }
}