package com.univer.hotelSystem.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univer.hotelSystem.dao.ApartmentDAO;
import com.univer.hotelSystem.domain.Apartment;

@Repository
public class ApartmentDAOImpl implements ApartmentDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void saveApartment(Apartment apartment) {
		sessionFactory.getCurrentSession().save(apartment);

	}

	public void updateApartment(Apartment apartment) {
		sessionFactory.getCurrentSession().update(apartment);

	}

	@SuppressWarnings("unchecked")
	public List<Apartment> apartmentList() {
		return sessionFactory.getCurrentSession().createQuery("from Apartment")
				.list();
	}

	public void deleteApartment(Integer id) {
		Apartment apartment = (Apartment) sessionFactory.getCurrentSession()
				.load(Apartment.class, id);

		if (apartment != null) {
			sessionFactory.getCurrentSession().delete(apartment);
		}
	}

	public Apartment getApartmentById(Integer id) {
		Apartment apartment = (Apartment) sessionFactory.getCurrentSession()
				.load(Apartment.class, id);

		return apartment;
	}

}
