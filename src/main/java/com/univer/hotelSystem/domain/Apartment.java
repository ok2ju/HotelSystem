package com.univer.hotelSystem.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Apartment")
public class Apartment {
	
	@Id
	@Column(name="apartment_id")
	@GeneratedValue
	private Integer id;
	
	@Column(name="room_number")
	private int numberOfRoom;
	
	@Column(name="class_apartment")
	private String classApartment;
	
	@Column(name="number_of_rooms")
	private int numberOfRooms;
	
	@Column(name="floor")
	private int floor;
	
	@Column(name="apartment_info")
	private String info;
	
	@Column(name="cost")
	private double cost;
	
	@ManyToMany
	@JoinTable(name="JOIN_APARTMENT_SERVICE",
				joinColumns={@JoinColumn(name="apartment_id")},
				inverseJoinColumns={@JoinColumn(name="service_id")})
	private List<Service> services;
	
	@ManyToOne
	@JoinColumn(name="hotel_id")
	private Hotel hotel;

	public String getClassApartment() {
		return classApartment;
	}

	public void setClassApartment(String classApartment) {
		this.classApartment = classApartment;
	}

	public int getNumberOfRooms() {
		return numberOfRooms;
	}

	public void setNumberOfRooms(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public List<Service> getServices() {
		return services;
	}

	public void setServices(List<Service> services) {
		this.services = services;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getNumberOfRoom() {
		return numberOfRoom;
	}

	public void setNumberOfRoom(int numberOfRoom) {
		this.numberOfRoom = numberOfRoom;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
}
