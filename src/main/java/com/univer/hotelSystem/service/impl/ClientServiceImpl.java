package com.univer.hotelSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.univer.hotelSystem.dao.ClientDAO;
import com.univer.hotelSystem.domain.Client;
import com.univer.hotelSystem.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {
	
	@Autowired
	private ClientDAO clientDAO;
	
	@Transactional
	public void saveClient(Client client) {
		clientDAO.saveClient(client);
	}
	
	@Transactional
	public List<Client> clientList() {
		return clientDAO.clientList();
	}
	
	@Transactional
	public void removeClientById(Integer id) {
		clientDAO.removeClientById(id);
	}
	
	@Transactional
	public void removeClient(Client client) {
		clientDAO.removeClient(client);
	}
	
	@Transactional
	public Client findClientById(Integer id) {
		return clientDAO.findClientById(id);
	}
	
	@Transactional
	public Client findClientByUsername(String login) {
		return clientDAO.findClientByUsername(login);
	}

}
