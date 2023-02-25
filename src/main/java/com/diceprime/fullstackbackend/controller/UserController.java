package com.diceprime.fullstackbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diceprime.fullstackbackend.entity.User;
import com.diceprime.fullstackbackend.repository.UserRepository;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/users")
	User newUser(@RequestBody User newUser)
	{
		return userRepository.save(newUser);
	}
	
	@GetMapping("/users")
	List<User> listUsers()
	{
		return userRepository.findAll();
	}
}
