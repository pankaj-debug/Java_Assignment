package com.example.demo.PostService;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.Model.Posts;
import com.example.demo.Service.PostService;
import com.example.demo.UserRepository.PostRepository;

@RunWith(MockitoJUnitRunner.class)
public class PostServiceTest {
	
	@Mock
	PostRepository postRepositoryMock;
	@InjectMocks
	PostService postServiceImpl;	
	
	@Test
	public void returnPostsFindAll() {
	List<Posts> posts = new ArrayList<>();
	posts.add(new Posts());
	
	given(postRepositoryMock.findAll()).willReturn(posts);
	
	List <Posts> post1 =postServiceImpl.findAll();
	assertEquals(post1,posts);
	}
}