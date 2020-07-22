package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.Users;
import com.example.demo.Service.UserService;

@RestController
public class UserController {	
	@Autowired
    private UserService userService;

	@RequestMapping(value = "/userList", method=RequestMethod.GET)	
    public List<Users> getCities() {
        List<Users> usersList = userService.findAll();
        return usersList;
    }

}
