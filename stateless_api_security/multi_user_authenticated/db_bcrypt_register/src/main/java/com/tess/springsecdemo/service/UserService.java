package com.tess.springsecdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.tess.springsecdemo.dao.UserRepo;
import com.tess.springsecdemo.model.User;

import java.util.List;

@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;

	private BCryptPasswordEncoder encoder=new BCryptPasswordEncoder(12);

	public List<User> getAllUsers() {
		List<User> users = repo.findAll();
		return users;
	}
	public User saveUser(User user) {
		user.setPassword(encoder.encode(user.getPassword()));
		System.out.println(user.getPassword());
		return repo.save(user) ;

	}
}
