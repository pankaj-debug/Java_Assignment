package com.example.demo.UserController;

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

import com.example.demo.Model.Users;
import com.example.demo.Service.UserService;

@WebMvcTest(controllers = UserControllerTest.class)
@ActiveProfiles("test")
public class UserControllerTest {
	
	@Autowired                           
    private MockMvc mockMvc; 
	
	@MockBean                           
    private UserService userService;
	
	private List<Users> userList;
	
	@Test
	public void fetchAllUsers() throws Exception {
		this.userList= new ArrayList<>();
		
		given(userService.findAll()).willReturn(userList);
		
		this.mockMvc.perform(get("/userList")).andExpect(status().isOk());	
}
}