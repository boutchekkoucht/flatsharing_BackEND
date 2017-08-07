package com.network.flatsharing.services;

import java.util.List;

import com.network.flatsharing.entities.User;

public interface IUserService {
	
	public User saveUser(User u);
	public List<User> getAllUser();
	public User updateUser(User u);
	public void deleteUser(Long id);
	
}
