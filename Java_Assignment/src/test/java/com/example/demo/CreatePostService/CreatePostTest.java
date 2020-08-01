package com.example.demo.CreatePostService;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.Model.Posts;
import com.example.demo.Service.CreatePost;
import com.example.demo.UserRepository.CreateRepository;

@RunWith(MockitoJUnitRunner.class)
public class CreatePostTest {

	@Mock
	CreateRepository createRepositoryMock;

	@InjectMocks
	CreatePost createPostsImpl;

	@Test
	public void createPost() {
		final Posts post = new Posts(1L,"TestPostName","TestDesc");
		given(createRepositoryMock.save(post));
		Posts savedpost = createPostsImpl.save(post);
		
		//assertThat(savedpost).isNotNull();
		
		verify(createRepositoryMock).save(savedpost);
	}

	
}