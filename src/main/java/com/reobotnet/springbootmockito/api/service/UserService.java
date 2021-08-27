package com.reobotnet.springbootmockito.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.reobotnet.springbootmockito.api.dao.UserRepository;
import com.reobotnet.springbootmockito.api.model.User;



@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	

	public User addUser(User user) {
		return repository.save(user);
	}

	public List<User> getUsers() {
		List<User> users = repository.findAll();
		System.out.println("Getting data from DB : " + users);
		return users;
	}

	public List<User> getUserbyAddress(String address) {
		return repository.findByAddress(address);
	}

	public void deleteUser(User user) {
		repository.delete(user);
	}
}
