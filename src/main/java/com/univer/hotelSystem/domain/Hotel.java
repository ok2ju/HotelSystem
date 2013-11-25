package com.univer.hotelSystem.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="hotel")
public class Hotel {
	
	@Id
	@Column(name="hotel_id")
	@GeneratedValue
	private Integer id;
	
	@Column(name="HOTEL_NAME")
	private String name;
	
	@Column(name="HOTEL_CLASS")
	private String hotelClass;
	
	@Column(name="NUMBER_OF_APARTMENTS")
	private int numberOfApartments;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="HOTEL_Info")
	private String info;
	
	@OneToMany(targetEntity = Apartment.class, mappedBy = "hotel",
			cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Apartment> apartments;
	
	@OneToMany(targetEntity = Comment.class, mappedBy = "hotel", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Comment> comments;

	public String getHotelClass() {
		return hotelClass;
	}

	public void setHotelClass(String hotelClass) {
		this.hotelClass = hotelClass;
	}

	public int getNumberOfApartments() {
		return numberOfApartments;
	}

	public void setNumberOfApartments(int numberOfApartments) {
		this.numberOfApartments = numberOfApartments;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public List<Apartment> getApartments() {
		return apartments;
	}

	public void setApartments(List<Apartment> apartments) {
		this.apartments = apartments;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}
