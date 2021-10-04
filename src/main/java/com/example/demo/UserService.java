package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;

	public Long save(User user) {
		
		if(user.getAge() < 21) {
			throw new IllegalArgumentException();
		}
		
		System.out.println("User saved");
		
		// Business logic
		userRepository.save(user);
		
		return user.getId();
	}
	
	
	public List<User> getUsers() {
		return userRepository.findAll();
	}
	
}
