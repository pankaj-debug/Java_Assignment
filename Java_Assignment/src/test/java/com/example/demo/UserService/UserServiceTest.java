package com.example.demo.UserService;

import static org.junit.Assert.assertEquals;
import static org.mockito.BDDMockito.given;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import com.example.demo.Model.Users;
import com.example.demo.Service.UserService;
import com.example.demo.UserRepository.UserRepository;

public class UserServiceTest {
	@Mock
	UserRepository userRepositoryMock;
	@InjectMocks
	UserService userServiceImpl;	
	
	@Test
	public void returnUsersFindAll() {
	List<Users> users = new ArrayList<>();
	users.add(new Users(1L,"FName","LName","678",12345L));
	
	given(userRepositoryMock.findAll()).willReturn(users);
	
	List <Users> user1 =userServiceImpl.findAll();
	assertEquals(user1,users);
	}

}
