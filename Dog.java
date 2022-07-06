package com.example.demo.animal;

public class Dog {

	private int id;
	private String name;
	private String colour;
	private String species;
	private int age;

	public Dog() {
		super();

	}

	public Dog(int id, String name, String colour, String species, int age) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.species = species;
		this.age = age;

	}
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", + name=" + name + ", colour=" + colour + ", species=" + species + ", age=" + age + "]";
	}

}
