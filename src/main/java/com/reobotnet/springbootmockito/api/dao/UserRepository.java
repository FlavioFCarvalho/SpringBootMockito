package com.reobotnet.springbootmockito.api.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.reobotnet.springbootmockito.api.model.User;



public interface UserRepository extends MongoRepository<User, Integer>{
	
	List<User> findByAddress(String address);

}