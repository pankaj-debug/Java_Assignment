package com.example.demo.PostController;

import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.Model.Posts;
import com.example.demo.Service.PostService;

@WebMvcTest(controllers = PostControllerTest.class)
@ActiveProfiles("test")
public class PostControllerTest {

	@Autowired                           
    private MockMvc mockMvc;  
	
	@MockBean                           
    private PostService postService;
	
	private List<Posts> postList;  
	
	@Test
	public void fetchAllPosts() throws Exception {
		this.postList= new ArrayList<>();
		
		given(postService.findAll()).willReturn(postList);
		
		this.mockMvc.perform(get("/postsList")).andExpect(status().isOk());		
	}
	
}