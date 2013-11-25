package com.univer.hotelSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.univer.hotelSystem.domain.Hotel;
import com.univer.hotelSystem.service.HotelService;

@Controller
public class HotelController {
	
	@Autowired
	private HotelService hotelService;
	
	@RequestMapping(value = "/hotel", method = RequestMethod.GET)
	public String hotelForm(Model model){
		
		model.addAttribute("hotel", new Hotel());
		
		return "hotel";
	}
	
	@RequestMapping(value = "/addHotel", method = RequestMethod.POST)
	public String addHotel(@ModelAttribute("hotel") Hotel hotel){
		
		hotelService.saveHotel(hotel);
		
		return "hotel";
	}
	
}
