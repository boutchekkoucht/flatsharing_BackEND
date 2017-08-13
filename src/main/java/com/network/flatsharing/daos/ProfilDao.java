package com.network.flatsharing.daos;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.network.flatsharing.entities.Profil;

@Repository
public class ProfilDao implements IProfilDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public Profil saveProfil(Profil u) {
		sessionFactory.getCurrentSession().save(u);
		return u;
	}

	@Override
	public List<Profil> getAllProfil() {
		
		return sessionFactory.getCurrentSession().createQuery("from Profil").getResultList();
	}

	@Override
	public Profil updateProfil(Profil u) {
		sessionFactory.getCurrentSession().merge(u);
		return u;
	}

	@Override
	public void deleteProfil(Long id) {
		sessionFactory.getCurrentSession().createQuery("delete Profil where id ="+id).executeUpdate();
		
	}

}
