package com.network.flatsharing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.network.flatsharing.daos.IUserDao;
import com.network.flatsharing.entities.User;

@Service
public class UserService   implements IUserService{

	@Autowired
	private IUserDao dao;
	
	
	@Override
	@Transactional
	public User saveUser(User u) {
		return dao.saveUser(u);
	}

	@Override
	@Transactional(readOnly = true)
	public List<User> getAllUser() {
		return dao.getAllUser();
	}

	@Override
	@Transactional
	public User updateUser(User u) {
		// TODO Auto-generated method stub
		return dao.updateUser(u);
	}

	@Override
	@Transactional
	public void deleteUser(Long id) {
		dao.deleteUser(id);
	}
	

}
