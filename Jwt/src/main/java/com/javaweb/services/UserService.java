package com.javaweb.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.javaweb.entity.User;
import com.javaweb.repository.IUserRepository;

@Service
public class UserService {
	
	private final IUserRepository userRepository;
	
	public UserService(IUserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public List<User>allUsers(){
		
		List <User> users = new ArrayList<>();
		
		userRepository.findAll().forEach(users::add);
		
		return users;
	}

	public Optional<User> findByEmail(String email) {
		return userRepository.findByEmail(email);
	}


	
}
