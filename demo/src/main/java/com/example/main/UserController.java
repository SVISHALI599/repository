package com.example.main;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	UserMapper mapper;

	public UserController(UserMapper mapper) {
		this.mapper = mapper;
	}

	@GetMapping("/all")

	public List<User> getAllUser() {
		return mapper.getAllUser();
	}

	@GetMapping("/id")

	public User getUserById(@RequestParam("id") int id) {
		return mapper.getUserById(id);
	}
}