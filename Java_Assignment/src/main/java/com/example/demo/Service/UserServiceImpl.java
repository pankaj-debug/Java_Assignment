package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Bean.Users;
import com.example.demo.UserRepository.UserRepository;

/*
 * service to fetch all users.
 * */

@Service
public class UserServiceImpl implements UserService {	
	@Autowired
    private UserRepository userRepository;
	
	@Override
    public List < Users > findAll() {
        return userRepository.findAll();
    }
}