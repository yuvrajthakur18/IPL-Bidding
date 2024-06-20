package com.yuvraj.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;

@Entity
public class Player {
	private Long id;
	private String name;
	private int age;
	private String category;
	private double biddingPrice;
	private String email;
	@ManyToOne
	@JsonBackReference
	private Team team;
	
	public Player() {
		super();
	}

	public Player(Long id, String name, int age, String category, double biddingPrice, String email, Team team) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.category = category;
		this.biddingPrice = biddingPrice;
		this.email = email;
		this.team = team;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public double getBiddingPrice() {
		return biddingPrice;
	}

	public void setBiddingPrice(double biddingPrice) {
		this.biddingPrice = biddingPrice;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
	
	
}
