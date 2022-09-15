package com.user.userservice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.userservice.UserserviceApplication;
import com.user.userservice.entity.User;
import com.user.userservice.repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository UserRepository;
	
	@PostMapping("/")
	public UserserviceApplication saveUser(@RequestBody UserserviceApplication user) {
		return (UserserviceApplication) this.UserRepository.save(user);
	}
	
	
	@GetMapping("/")
	public List<User> getAlluser(){
		return this.UserRepository.findAll();
	}

}