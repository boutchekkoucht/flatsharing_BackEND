package com.network.flatsharing.daos;

import java.util.List;

import com.network.flatsharing.entities.User;



public interface IUserDao {
	
	public User saveUser(User u);
	public List<User> getAllUser();
	public User updateUser(User u);
	public void deleteUser(Long id);

}
