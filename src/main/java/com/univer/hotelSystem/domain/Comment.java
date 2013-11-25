package com.univer.hotelSystem.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="COMMENT")
public class Comment {
	
	@Id
	@Column(name="comment_id")
	@GeneratedValue
	private Integer id;
	
	@Column(name="Username")
	private String username;
	
	@Column(name="Text")
	private String text;
	
	@Column(name="Rate")
	private int rate;
	
	@ManyToOne
	@JoinColumn(name = "hotel_id")
	private Hotel hotel;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
}
