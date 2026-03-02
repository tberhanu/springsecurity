package com.tess.springsecdemo.dao;

import com.tess.springsecdemo.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	User findByUsername(String username);
}
