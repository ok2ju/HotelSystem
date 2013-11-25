package com.univer.hotelSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.univer.hotelSystem.domain.Client;
import com.univer.hotelSystem.service.ClientService;

@Controller
public class RegistrationController {
	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping(value="/registration", method=RequestMethod.GET)
	public String registrationForm(Model model){
		
		model.addAttribute("client", new Client());
		
		return "registration";
	}
	
	@RequestMapping(value="/registration", method=RequestMethod.POST)
	public String processRegistration(@ModelAttribute("client") Client client){
		
		clientService.saveClient(client);
		
		return "registration";
	}
	
}
