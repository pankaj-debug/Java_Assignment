package com.example.demo.RunnerClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Bean.Posts;
import com.example.demo.Service.PostService;


@Component
public class PostRunner implements CommandLineRunner  {
@Autowired
private PostService postService;

@Override
public void run(String... args) throws Exception {
	// get list of all Users
    List <Posts> posts = postService.findAll();
    posts.forEach(post -> System.out.println(post.toString()));	
}	
}