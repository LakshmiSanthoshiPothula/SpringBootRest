package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.User;

public interface UserServiceInt {

	void save(User user);

	List<User> findAll();

}
