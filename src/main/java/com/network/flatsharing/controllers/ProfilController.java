package com.network.flatsharing.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.network.flatsharing.entities.Profil;
import com.network.flatsharing.entities.User;
import com.network.flatsharing.services.IProfilService;
import com.network.flatsharing.services.IUserService;

@Controller
public class ProfilController {

	   @Autowired
	   private 	IProfilService service;
	   @RequestMapping(path={"/profil"},method=RequestMethod.GET)
	   public String sayHello(Model model) {
		   
		   Profil p  = new Profil("ADMIN","this profil destinated to admin users");
		   service.saveProfil(p);
		   
	      return "index";
	   }
	   
	  }
