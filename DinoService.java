package com.example.demo.animal;


	import java.util.List;


	public interface DinoService {

		Dinosaur getById(int id);

		List<Dinosaur> getAll();

		Dinosaur create(Dinosaur dino);

		Dinosaur update(int id, String name, String species, Integer age);

		void delete(int id);

	}

