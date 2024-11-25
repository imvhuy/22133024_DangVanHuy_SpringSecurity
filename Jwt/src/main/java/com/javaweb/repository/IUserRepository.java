package com.javaweb.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaweb.entity.User;

public interface IUserRepository extends JpaRepository<User, Integer>{
	
	Optional<User> findByEmail(String email);
}
