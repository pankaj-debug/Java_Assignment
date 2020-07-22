package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.Posts;
import com.example.demo.Service.PostService;


@RestController
public class PostController {
	
	@Autowired
    private PostService postService;

	@RequestMapping(value = "/postsList", method=RequestMethod.GET)	
    public List<Posts> getCities() {
        List<Posts> postsList = postService.findAll();
        return postsList;
    }	
}