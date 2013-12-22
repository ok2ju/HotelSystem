package com.univer.hotelSystem.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univer.hotelSystem.dao.ServiceDAO;
import com.univer.hotelSystem.domain.Service;

@Repository
public class ServiceDAOImpl implements ServiceDAO {

	@Autowired
	SessionFactory sessionFactory;

	public void addService(Service service) {
		sessionFactory.getCurrentSession().saveOrUpdate(service);
	}
	
	public void updateService(Service service) {
		sessionFactory.getCurrentSession().update(service);
	}
	
	@SuppressWarnings("unchecked")
	public List<Service> listService() {
		return sessionFactory.getCurrentSession().createQuery("from Service").list();
	}

	public void deleteService(Integer id) {
		Service service = (Service) sessionFactory.getCurrentSession().load(Service.class, id);

		if (service != null) {
			sessionFactory.getCurrentSession().delete(service);
		}
	}

	public Service getServiceById(Integer id) {
		Service service = (Service) sessionFactory.getCurrentSession().load(Service.class, id);
		
		return service;
	}

}
