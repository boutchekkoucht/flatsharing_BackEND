package com.network.flatsharing.daos;

import java.util.List;

import com.network.flatsharing.entities.Profil;



public interface IProfilDao {
	
	public Profil saveProfil(Profil u);
	public List<Profil> getAllProfil();
	public Profil updateProfil(Profil u);
	public void deleteProfil(Long id);

}
