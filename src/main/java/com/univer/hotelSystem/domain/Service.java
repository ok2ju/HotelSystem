package com.univer.hotelSystem.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Service")
public class Service {
	
	@Id
	@Column(name="service_id")
	@GeneratedValue
	private Integer id;
	
	@Column(name="name_of_service")
	private String name;
	
	@Column(name="service_cost")
	private double cost;
	
	@Column(name="service_info")
	private String info;
	
	@ManyToMany
	@JoinTable(name="JOIN_APARTMENT_SERVICE",
				joinColumns={@JoinColumn(name="service_id")},
				inverseJoinColumns={@JoinColumn(name="apartment_id")})
	private List<Apartment> apartment;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public List<Apartment> getApartment() {
		return apartment;
	}

	public void setApartment(List<Apartment> apartment) {
		this.apartment = apartment;
	}
	
}
