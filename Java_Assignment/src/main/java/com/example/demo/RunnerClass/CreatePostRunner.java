package com.example.demo.RunnerClass;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Model.Posts;
import com.example.demo.Service.CreatePost;

@Component
public class CreatePostRunner implements CommandLineRunner{	
	@Autowired
    private Posts posts;
	
	@Override
	@Transactional
	public void run(String... args) throws Exception {
		// get list of all Users
	    // createPost.save();
		Posts p1 = new Posts();
		p1.setPostId(1);
		p1.setPostName("testPost");
		p1.setPostDesc("postDesc");
		((CreatePost) posts).save(p1);
		
		Posts p2 = new Posts();
		p2.setPostId(2);
		p2.setPostName("testPost2");
		p2.setPostDesc("postDesc2");
		((CreatePost) posts).save(p2);
		
				
	} 
}