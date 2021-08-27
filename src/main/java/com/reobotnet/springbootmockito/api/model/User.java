package com.reobotnet.springbootmockito.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.ToString;

@Document(collection = "users")
@Data
@ToString
public class User {
	@Id
	private int id;
	private String name;
	private int age;
	private String address;
	public User(int id, String name, int age, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	

}