package com.univer.hotelSystem.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

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
import com.univer.hotelSystem.domain.Service;
import com.univer.hotelSystem.service.ApartmentService;
import com.univer.hotelSystem.service.ClientService;
import com.univer.hotelSystem.service.ServiceService;

@Controller
public class ReservateController {
	
	@Autowired
	private ApartmentService apartmentService;
	
	@Autowired
	private ClientService clientService;
	
	@Autowired
	private ServiceService serviceService;
	
	@RequestMapping(value="/reservate", method=RequestMethod.GET) 
	public ModelAndView search() {
		ModelAndView mav = new ModelAndView("reservation");
		mav.addObject("apartment", new Apartment());
		
		return mav;
	}
	
	@RequestMapping(value="/reservate", method=RequestMethod.POST)
	public ModelAndView processSearch(@ModelAttribute(value="apartment") Apartment apartment){
		
		List<Apartment> apartmentList = apartmentService.findApartmentByCriteria(apartment.getNumberOfRooms(), apartment.getClassApartment(), apartment.getFloor());
		
		System.out.println(apartmentList.size());
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("apartment", apartmentList);
		mav.setViewName("showFindApartments");
		
		return mav;
		
	}
	
	@RequestMapping(value = "reserve/{apartmentId}", method = RequestMethod.GET)
	public ModelAndView reserveApartment(@PathVariable Integer apartmentId, HttpSession session){
		ModelAndView model = new ModelAndView("redirect:/listServicesForUser");
		Client client1 = (Client) session.getAttribute("client");
		Apartment findResultApartment = apartmentService.getApartmentById(apartmentId);
		findResultApartment.setFlag("Reserve");
		client1.setApartment(findResultApartment);
		clientService.saveClient(client1);
		
		return model;
	}
	
	@RequestMapping(value="/listServicesForUser", method=RequestMethod.GET)
	public ModelAndView showServicesForUser(){
		ModelAndView model = new ModelAndView("user_apply_service");
		List<Service> services = serviceService.listService();
		model.addObject("services", services);
		
		return model;
	}
	
	@RequestMapping(value="userAddService/{serviceId}", method=RequestMethod.GET)
	public ModelAndView chooseService(@PathVariable Integer serviceId, HttpSession session){
		ModelAndView mav = new ModelAndView("redirect:/listServicesForUser");
		Client testClient = (Client) session.getAttribute("client");
		Apartment testApartment = testClient.getApartment();
		Service testService = serviceService.getServiceById(serviceId);
		List<Service> listService = apartmentService.getAllServicesByApartmentId(testApartment.getId());
		listService.add(testService);
		testApartment.setServices(listService);
		apartmentService.saveApartment(testApartment);
		
		return mav;
	}
	
}
