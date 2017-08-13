package com.network.flatsharing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.network.flatsharing.daos.IProfilDao;
import com.network.flatsharing.entities.Profil;

@Service
public class ProfilService   implements IProfilService{

	@Autowired
	private IProfilDao dao;
	
	
	@Override
	@Transactional
	public Profil saveProfil(Profil u) {
		return dao.saveProfil(u);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Profil> getAllProfil() {
		return dao.getAllProfil();
	}

	@Override
	@Transactional
	public Profil updateProfil(Profil u) {
		// TODO Auto-generated method stub
		return dao.updateProfil(u);
	}

	@Override
	@Transactional
	public void deleteProfil(Long id) {
		dao.deleteProfil(id);
	}
	

}
