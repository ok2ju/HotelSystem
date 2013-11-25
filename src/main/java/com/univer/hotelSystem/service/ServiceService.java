package com.univer.hotelSystem.service;

import java.util.List;

import com.univer.hotelSystem.domain.Service;

public interface ServiceService {

	public void addService(Service service);

	public void updateService(Service service);

	public List<Service> listService();

	public void deleteService(Integer id);

	public Service getServiceById(Integer id);
}
