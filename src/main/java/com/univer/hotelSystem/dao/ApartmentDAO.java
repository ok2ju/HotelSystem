package com.univer.hotelSystem.dao;

import java.util.List;

import com.univer.hotelSystem.domain.Apartment;

public interface ApartmentDAO {
	
	public void saveApartment(Apartment apartment);
	
	public void updateApartment(Apartment apartment);
	
	public List<Apartment> apartmentList();
	
	public void deleteApartment(Integer id);
	
	public Apartment getApartmentById(Integer id);
	
	public List<Apartment> findApartmentByCriteria(int numberOfRooms, String classApartment, int floor);
}
