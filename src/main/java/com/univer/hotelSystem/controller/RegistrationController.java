package com.univer.hotelSystem.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.univer.hotelSystem.domain.Client;
import com.univer.hotelSystem.service.ClientService;
import com.univer.hotelSystem.service.HotelService;

@Controller
public class RegistrationController {
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private HotelService hotelService;
	
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
	public String homeHotel(Map<String, Object> map, HttpSession session){	
		map.put("client", session.getAttribute("client"));
		map.put("hotel", hotelService.findHotelById(1));
		
		return "home";
	}
	
	@RequestMapping(value = "/signin" , method = RequestMethod.GET)
	public String signinPage(Model model) {
		model.addAttribute("client", new Client());
		return "signin";
	}
	
	
	@RequestMapping(value="/signin", method=RequestMethod.POST)
	public ModelAndView processLogin(@ModelAttribute(value = "client") Client client, HttpSession session){
		Client testClient = clientService.findClientByUsername(client.getUserName());
		
		ModelAndView mav = new ModelAndView();
		
		if(testClient.getPassword().equals(client.getPassword())){
			client = testClient;
			//mav.addObject("client", client);
			session.setAttribute("client", client);
			mav.setViewName("redirect:/home");
		}else{
			mav.setViewName("signin");
		}
		return mav;
	}
	
}
