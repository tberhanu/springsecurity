package com.tess.springsecdemo.controller;

import com.tess.springsecdemo.model.User;
import com.tess.springsecdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping("users")
	public List<User> getUsers() {
		return service.getAllUsers();
	}

	@PostMapping("register")
	public User register(@RequestBody User user) {
	  return service.saveUser(user);
	}
}
