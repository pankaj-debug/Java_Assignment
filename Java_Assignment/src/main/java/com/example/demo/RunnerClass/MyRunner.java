package com.example.demo.RunnerClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.Bean.Users;
import com.example.demo.Service.UserService;


@Component
public class MyRunner implements CommandLineRunner{	
	@Autowired
    private UserService userService;
	
	@Override
	public void run(String... args) throws Exception {
		// get list of all Users
	    List <Users> users = userService.findAll();
		users.forEach(user -> System.out.println(user.toString()));		
	}  	
}