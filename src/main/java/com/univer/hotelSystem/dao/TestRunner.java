package com.univer.hotelSystem.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.univer.hotelSystem.domain.Apartment;
import com.univer.hotelSystem.domain.Client;
import com.univer.hotelSystem.domain.Comment;
import com.univer.hotelSystem.domain.Hotel;
import com.univer.hotelSystem.domain.Service;
import com.univer.hotelSystem.domain.User;

public class TestRunner {

	public static void main(String[] args) {
		
		Configuration config = new Configuration();
		config.addAnnotatedClass(Hotel.class);
		config.addAnnotatedClass(Apartment.class);
		config.addAnnotatedClass(Service.class);
		config.addAnnotatedClass(Comment.class);
		config.addAnnotatedClass(Client.class);
		config.configure();
		  
		new SchemaExport(config).create(true, true);
		/*
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.getCurrentSession();
		session.beginTransaction();
		
		Hotel hotel1 = new Hotel();
		hotel1.setName("Marina Bay Sands");
		hotel1.setHotelClass("5 stars");
		hotel1.setLocation("Singapore");
		hotel1.setNumberOfApartments(500);
		
		
        session.save(hotel1);
        session.getTransaction().commit();
        */
	}

}
