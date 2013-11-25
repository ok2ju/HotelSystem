package com.univer.hotelSystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univer.hotelSystem.dao.HotelDAO;
import com.univer.hotelSystem.domain.Hotel;
import com.univer.hotelSystem.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelDAO hotelDAO;
	
	@Transactional
	public void saveHotel(Hotel hotel) {
		hotelDAO.saveHotel(hotel);
		
	}
	
	@Transactional
	public void updateHotel(Hotel hotel) {
		hotelDAO.updateHotel(hotel);
		
	}
	
	@Transactional
	public void deleteHotel(Integer id) {
		hotelDAO.deleteHotel(id);
		
	}

}
