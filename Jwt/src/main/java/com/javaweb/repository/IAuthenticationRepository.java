package com.javaweb.repository;

import com.javaweb.entity.User;
import com.javaweb.models.LoginUserModel;
import com.javaweb.models.RegisterUserModel;

public interface IAuthenticationRepository {	
	public User signup(RegisterUserModel input);
	
	public User authenticate(LoginUserModel input);
}
