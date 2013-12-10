package com.univer.hotelSystem.dao;

import java.util.List;

import com.univer.hotelSystem.domain.Hotel;

public interface HotelDAO {
	
	public void saveHotel(Hotel hotel);
	
	public void updateHotel(Hotel hotel);
	
	public List<Hotel> listHotel();
	
	public void deleteHotel(Integer id);
	
	public Hotel findHotelById(Integer id);
}
