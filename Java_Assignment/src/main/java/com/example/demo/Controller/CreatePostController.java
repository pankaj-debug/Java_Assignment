package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.Posts;
import com.example.demo.Service.CreatePost;

@RestController
public class CreatePostController {
	
	@Autowired
	private Posts posts;
	@RequestMapping(value = "/createPost", method=RequestMethod.POST)
	public void createPost() {
		CreatePost createPost= null;
		createPost.save(posts);
	}	
}