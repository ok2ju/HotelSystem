package com.univer.hotelSystem.service;

import java.util.List;

import com.univer.hotelSystem.domain.Apartment;

public interface ApartmentService {

	public void saveApartment(Apartment apartment);

	public void updateApartment(Apartment apartment);

	public List<Apartment> apartmentList();

	public void deleteApartment(Integer id);

	public Apartment getApartmentById(Integer id);
}
