package com.univer.hotelSystem.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.univer.hotelSystem.domain.Apartment;
import com.univer.hotelSystem.domain.Client;
import com.univer.hotelSystem.domain.Service;
import com.univer.hotelSystem.service.ApartmentService;
import com.univer.hotelSystem.service.ClientService;
import com.univer.hotelSystem.service.ServiceService;

@Controller
public class UserProfileController {
	
	@Autowired
	private ApartmentService apartmentService;
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private ServiceService serviceService;
	
	@RequestMapping(value = "/userProfile", method = RequestMethod.GET)
	public ModelAndView showUserProfile(HttpSession session){
		ModelAndView model = new ModelAndView("user_profile");
		Client client = (Client) session.getAttribute("client");
		
		Client testClient = clientService.findClientByUsername(client.getUserName());
		Apartment apartment = testClient.getApartment();
		List<Service> services = apartment.getServices();
		
		model.addObject("apartment", apartment);
		model.addObject("services", services);
		
		return model;
	}
	
}
