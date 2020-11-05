package com.turkey.business;

public class Turkey {
	
	// Fields
	private int id;
	private String name;
	private double weight;
	
	// Constructors
	public Turkey() {
		super();
	}
	
	public Turkey(int id, String name, double weight) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
	}
	
	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
}