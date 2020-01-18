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

	@GetMapping("/allusers")

	public List<User> getAllUser() {
		return mapper.getAllUser();
	}

	@GetMapping("/userid")

	public User getUserById(@RequestParam("id") int id) {
		return mapper.getUserById(id);
	}
	@GetMapping("/userinsert")
	public User setUser(@RequestParam("user_name") String user_name, @RequestParam("user_password") String user_password,@RequestParam("user_age") Integer user_age,@RequestParam("user_gender") String user_gender,@RequestParam("user_mobile_number") String user_mobile_number,@RequestParam("user_email_id") String user_email_id,@RequestParam("user_address_line1") String user_address_line1,@RequestParam("user_address_line2") String user_address_line2,@RequestParam("user_address_line3") String user_address_line3)
	{
		return mapper.setUser();
	}
}