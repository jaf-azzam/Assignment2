package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/")
	void call() {		
		System.out.println("Called . . . !");
	}
	
	@GetMapping("/{id}")
	void getUser(@PathVariable Integer id) {		
		System.out.println("Called . . . !" + id);
	}
	
	
	@PostMapping
	String postCall(@RequestBody User user) {
		System.out.println("Got User " + user.getName());
		return "Post called";
	}
	
	@PutMapping
	String handlePutMapping() {
		System.out.println("PUT MAPPING");
		return "Put called";
	}
}
