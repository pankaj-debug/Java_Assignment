package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Posts;
import com.example.demo.Service.CreatePost;

@RestController
public class CreatePostController {
	@Autowired
	private CreatePost createPost;
	@Qualifier
	private Posts posts;
	@PostMapping(value = "/createPost")
	public void createPost(@RequestBody Posts posts) {
		createPost.save(posts);
	}	
}