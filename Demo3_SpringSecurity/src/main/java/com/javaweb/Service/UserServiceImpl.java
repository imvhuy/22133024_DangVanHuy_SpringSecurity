package com.javaweb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.javaweb.Repository.UserRepository;
import com.javaweb.Service.Impl.MyUserService;
import com.javaweb.entity.Users;
@Service
public class UserServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername( String username) throws UsernameNotFoundException{
		Users user= userRepository.getUserByUsername(username);
		
		if ( user ==null)
		{
			throw new UsernameNotFoundException("Could not dinf user");
		}
		return new MyUserService(user);
	} 
}
