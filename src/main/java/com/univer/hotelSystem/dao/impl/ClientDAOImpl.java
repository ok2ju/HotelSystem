package com.univer.hotelSystem.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.univer.hotelSystem.dao.ClientDAO;
import com.univer.hotelSystem.domain.Client;

@Repository
public class ClientDAOImpl implements ClientDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void saveClient(Client client) {
		sessionFactory.getCurrentSession().saveOrUpdate(client);	
	}

	@SuppressWarnings("unchecked")
	public List<Client> clientList() {
		return sessionFactory.getCurrentSession().createQuery("from Client").list();
	}

	public void removeClientById(Integer id) {
		Client client = (Client) sessionFactory.getCurrentSession()
				.load(Client.class, id);

		if (client != null) {
			sessionFactory.getCurrentSession().delete(client);
		}
	}

	public void removeClient(Client client) {
		sessionFactory.getCurrentSession().delete(client);
	}

	public Client findClientById(Integer id) {
		Client client = (Client) sessionFactory.getCurrentSession()
				.load(Client.class, id);

		return client;
	}

	public Client findClientByUsername(String login) {		
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Client.class);
		criteria.add(Restrictions.like("userName", login));
		return (Client) criteria.uniqueResult();
	}

}
