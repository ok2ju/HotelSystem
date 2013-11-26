package com.univer.hotelSystem.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.univer.hotelSystem.domain.Client;
import com.univer.hotelSystem.domain.Hotel;
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
		
		return "home";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String homeHotel(Map<String, Object> map){	
		map.put("client", new Client());
		
		return "home";
	}
	
	@RequestMapping(value = "/signin" , method = RequestMethod.GET)
	public String signinPage(Model model) {
		model.addAttribute("client", new Client());
		return "signin";
	}
	
	
	@RequestMapping(value="/signin", method=RequestMethod.POST)
	public String processLogin(@ModelAttribute(value = "client") Client client, Map<String, Object> map){
		Client testClient = clientService.findClientByUsername(client.getUserName());
		
		if(testClient.getPassword().equals(client.getPassword())){
			client = testClient;
			map.put("client", client);
			return "home";
		}else{
			return "signin";
		}
	}
	
}
