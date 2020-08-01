package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Posts;
import com.example.demo.Service.PostService;

@RestController
public class PostController {
	
	@Autowired
    private PostService postService;

	@GetMapping(value = "/postsList")	
    public List<Posts> getCities() {
        List<Posts> postsList = postService.findAll();
        return postsList;
    }	
}