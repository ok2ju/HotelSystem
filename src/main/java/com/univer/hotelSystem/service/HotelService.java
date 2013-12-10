package com.univer.hotelSystem.service;

import java.util.List;

import com.univer.hotelSystem.domain.Hotel;

public interface HotelService {

	public void saveHotel(Hotel hotel);

	public void updateHotel(Hotel hote);

	public void deleteHotel(Integer id);
	
	public List<Hotel> listHotel();
	
	public Hotel findHotelById(Integer id);
}
