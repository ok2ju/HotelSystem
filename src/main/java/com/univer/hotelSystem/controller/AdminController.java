package com.univer.hotelSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.univer.hotelSystem.domain.Apartment;
import com.univer.hotelSystem.domain.Client;
import com.univer.hotelSystem.domain.Hotel;
import com.univer.hotelSystem.domain.User;
import com.univer.hotelSystem.service.ApartmentService;
import com.univer.hotelSystem.service.ClientService;
import com.univer.hotelSystem.service.HotelService;

@Controller
public class AdminController {
	
	@Autowired
	private ApartmentService apartmentService;
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping(value="/admin", method=RequestMethod.GET)
	public String apartmentForm(Model model){
		
		model.addAttribute("apartment", new Apartment());
		
		return "admin_add_apartment";
	}
	
	@RequestMapping(value="/addApartment", method=RequestMethod.POST)
	public String addApartment(@ModelAttribute("apartment") Apartment apartment){
		
		Hotel hotel = hotelService.findHotelById(1);
		apartment.setHotel(hotel);
		
		apartmentService.saveApartment(apartment);
		
		return "admin_add_apartment";
	}
	
	@RequestMapping(value="/listApartments", method=RequestMethod.GET)
	public ModelAndView showApartment(){
		ModelAndView model = new ModelAndView("show_apartment_list");
		List<Apartment> apartments = apartmentService.apartmentList();
		model.addObject("apartments", apartments);
		
		return model;
	}
	
	@RequestMapping(value="/listHotels", method=RequestMethod.GET)
	public ModelAndView showHotel(){
		ModelAndView model = new ModelAndView("show_hotel_list");
		List<Hotel> hotels = hotelService.listHotel();
		model.addObject("hotels", hotels);
		
		return model;
	}
	
	@RequestMapping(value="/listClients", method=RequestMethod.GET)
	public ModelAndView showClients(){
		ModelAndView model = new ModelAndView("show_user_list");
		List<Client> clients = clientService.clientList();
		model.addObject("clients", clients);
		
		return model;
	}
	
	@RequestMapping(value = "remove/{userId}", method = RequestMethod.GET)
	public ModelAndView removeUser(@PathVariable Integer userId){
		ModelAndView model = new ModelAndView("redirect:/listClients");
		clientService.removeClientById(userId);
		
		return model;
	}
	
}
