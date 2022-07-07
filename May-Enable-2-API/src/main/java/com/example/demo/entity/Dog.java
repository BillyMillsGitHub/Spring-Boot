package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity // Table
public class Dog {

	
	@Id // PK
	@GeneratedValue(strategy = GenerationType.IDENTITY) // AI
	private Integer id;
	
	@Column(name = "dogName", nullable = false, unique = true)
	private String name;
	
	private String colour;
	
	private String species;
	
	private Integer age;

	public Dog() {
		super();
		// REQUIRED
	}

	public Dog(String name, String colour, String species, Integer age) {
		super();
		this.name = name;
		this.colour = colour;
		this.species = species;
		this.age = age;

	}
//	public Dog(Integer id, String name, String species, int age) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.species = species;
//		this.age = age;
//	}

	public Dog(Integer id, String name, String colour, String species, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.species = species;
		this.age = age;
	}

	// REQUIRED
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}



}
