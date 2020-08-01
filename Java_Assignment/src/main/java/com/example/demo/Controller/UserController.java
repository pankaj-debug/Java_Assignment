package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Users;
import com.example.demo.Service.UserService;

@RestController
public class UserController {	
	@Autowired
    private UserService userService;

	@GetMapping(value = "/userList")	
    public List<Users> getUser() {
        List<Users> usersList = userService.findAll();
        return usersList;
    }

}
