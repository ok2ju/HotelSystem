package com.univer.hotelSystem.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univer.hotelSystem.dao.ApartmentDAO;
import com.univer.hotelSystem.domain.Apartment;
import com.univer.hotelSystem.domain.Service;

@Repository
public class ApartmentDAOImpl implements ApartmentDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void saveApartment(Apartment apartment) {
		sessionFactory.getCurrentSession().merge(apartment);

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

	@SuppressWarnings("unchecked")
	public List<Apartment> findApartmentByCriteria(int numberOfRooms, String classApartment, int floor) {
		Apartment exampleApartment = new Apartment();
		exampleApartment.setClassApartment(classApartment);
		exampleApartment.setNumberOfRooms(numberOfRooms);
		exampleApartment.setFloor(floor);
		
		Criteria cr = getCurrentSession().createCriteria(Apartment.class);
		cr
			.add(Restrictions.like("numberOfRooms", numberOfRooms))
			.add(Restrictions.like("classApartment", classApartment))
			.add(Restrictions.like("floor", floor))
			.add(Restrictions.like("flag", "empty"));
		
		List<Apartment> apartments = cr.list();
		
		return apartments;
	}
	
	public Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	public List<Service> getAllServicesByApartmentId(Integer id) {
		Criteria cr = getCurrentSession().createCriteria(Service.class);
		cr.createAlias("apartment", "apartment");
		cr.add(Restrictions.like("apartment.id", id));
		return (List<Service>) cr.list();
	}

}
