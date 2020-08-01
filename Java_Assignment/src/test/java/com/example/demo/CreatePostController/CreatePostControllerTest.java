package com.example.demo.CreatePostController;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(controllers = CreatePostControllerTest.class)
@ActiveProfiles("test")
public class CreatePostControllerTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void createPost() throws Exception{		
		//Posts post = new Posts(1L,"TestName","TestDesc");
		this.mockMvc.perform(MockMvcRequestBuilders.post("/createPost").
				contentType(MediaType.APPLICATION_FORM_URLENCODED_VALUE)
				.param("1")
				.param("TestName").param("TestDesc"));
	}			
}