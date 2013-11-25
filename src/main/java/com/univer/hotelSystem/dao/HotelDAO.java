package com.univer.hotelSystem.dao;

import com.univer.hotelSystem.domain.Hotel;

public interface HotelDAO {
	
	public void saveHotel(Hotel hotel);
	
	public void updateHotel(Hotel hotel);
	
	public void deleteHotel(Integer id);
}
