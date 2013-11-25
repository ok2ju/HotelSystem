package com.univer.hotelSystem.dao;

import java.util.List;

import com.univer.hotelSystem.domain.Client;

public interface ClientDAO {
	
	public void saveClient(Client client);
	
	public List<Client> clientList();
	
	public void removeClientById(Integer id);
	
	public void removeClient(Client client);
	
	public Client findClientById(Integer id);
	
	public Client findClientByUsername(String login);
	
}
