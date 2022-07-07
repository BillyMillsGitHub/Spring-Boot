package com.example.demo.service;



	import java.util.List;

import com.example.demo.entity.Dog;

	public interface DogService {

		Dog getById(Integer id);

		List<Dog> getAll();

		Dog update(Integer id, String name, String colour, String species, Integer age);

		void delete(Integer id);

		Dog create(Dog dog);

	}

