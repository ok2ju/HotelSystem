package com.univer.hotelSystem.service;

import com.univer.hotelSystem.domain.Hotel;

public interface HotelService {

	public void saveHotel(Hotel hotel);

	public void updateHotel(Hotel hote);

	public void deleteHotel(Integer id);
}
