package com.univer.hotelSystem.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univer.hotelSystem.dao.HotelDAO;
import com.univer.hotelSystem.domain.Hotel;

@Repository
public class HotelDAOImpl implements HotelDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void saveHotel(Hotel hotel) {
		sessionFactory.getCurrentSession().save(hotel);
	}
	
	public void updateHotel(Hotel hotel) {
		sessionFactory.getCurrentSession().update(hotel);
		
	}

	public void deleteHotel(Integer id) {
		Hotel hotel = (Hotel) sessionFactory.getCurrentSession().load(Hotel.class, id);

		if (hotel != null) {
			sessionFactory.getCurrentSession().delete(hotel);
		}
	}

}
