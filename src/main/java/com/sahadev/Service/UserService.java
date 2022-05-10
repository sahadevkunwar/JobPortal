package com.sahadev.Service;

import java.util.Optional;

import com.sahadev.entity.User;

public interface UserService {
	
	public User createUser(User user);
	
	public Optional<User> getUserById(Long userId);
	
    public void deleteUserById(Long userId);	

    
}
