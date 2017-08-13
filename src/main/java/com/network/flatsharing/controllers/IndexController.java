package com.network.flatsharing.controllers;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.network.flatsharing.entities.User;
import com.network.flatsharing.services.IUserService;

@Controller
public class IndexController {

	   @Autowired
	   private 	IUserService service;
	   @RequestMapping(path={"/hello"},method=RequestMethod.GET)
	   public String sayHello(Model model) {
	      model.addAttribute("message","Hello Spring MVC!");
	     
	      //Java 8 LocalDate
	      DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
	      LocalDate date=LocalDate.now();
	      model.addAttribute("date", date.format(formatter));
	      
	      return "index";
	   }
	   
	   @RequestMapping(path={"/saveUser"},method=RequestMethod.GET)
	   public String addUser(Model model) {
		   User u = new User("Mohammed","BOUTCHEKKOUCHT","boutchekkoucht@hotmail.com","dd6ed9");
		   service.saveUser(u);
		   
		   u.setLast_name("boutchekkou");
		   service.updateUser(u);
		   
		   service.deleteUser(3L);
		   model.addAttribute("user",u);
		   return "index";
	   }
}
