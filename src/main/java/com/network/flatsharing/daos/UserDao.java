package com.network.flatsharing.daos;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.network.flatsharing.entities.User;

@Repository
public class UserDao implements IUserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public User saveUser(User u) {
		sessionFactory.getCurrentSession().save(u);
		return u;
	}

	@Override
	public List<User> getAllUser() {
		
		return sessionFactory.getCurrentSession().createQuery("from User").getResultList();
	}

	@Override
	public User updateUser(User u) {
		sessionFactory.getCurrentSession().merge(u);
		return u;
	}

	@Override
	public void deleteUser(Long id) {
		sessionFactory.getCurrentSession().createQuery("delete User where id ="+id).executeUpdate();
		
	}

}
