package com.univer.hotelSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univer.hotelSystem.dao.ApartmentDAO;
import com.univer.hotelSystem.domain.Apartment;
import com.univer.hotelSystem.service.ApartmentService;

@Service
public class ApartmentServiceImpl implements ApartmentService {
	
	@Autowired
	private ApartmentDAO apartmentDAO;

	@Transactional
	public void saveApartment(Apartment apartment) {
		apartmentDAO.saveApartment(apartment);
		
	}
	
	@Transactional
	public void updateApartment(Apartment apartment) {
		apartmentDAO.updateApartment(apartment);
		
	}
	
	@Transactional
	public List<Apartment> apartmentList() {
		return apartmentDAO.apartmentList();
	}
	
	@Transactional
	public void deleteApartment(Integer id) {
		apartmentDAO.deleteApartment(id);
		
	}
	
	@Transactional
	public Apartment getApartmentById(Integer id) {
		return apartmentDAO.getApartmentById(id);
	}
	
	@Transactional
	public List<Apartment> findApartmentByCriteria(int numberOfRooms, String classApartment, int floor) {
		return apartmentDAO.findApartmentByCriteria(numberOfRooms, classApartment, floor);
	}

}
