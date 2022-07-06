package com.example.demo.animal;



	import java.util.List;

	public interface DogService {

		Dog getById(int id);

		List<Dog> getAll();

		Dog create(Dinosaur dino);

		Dog update(int id, String name, String colour, String species, Integer age);

		void delete(int id);

		Dog create(Dog dog);

	}

