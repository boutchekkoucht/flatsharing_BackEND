package com.network.flatsharing.services;

import java.util.List;

import com.network.flatsharing.entities.Profil;

public interface IProfilService {
	
	public Profil saveProfil(Profil u);
	public List<Profil> getAllProfil();
	public Profil updateProfil(Profil u);
	public void deleteProfil(Long id);
	
}
