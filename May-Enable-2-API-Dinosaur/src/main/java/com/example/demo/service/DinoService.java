package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Dinosaur;

public interface DinoService {

	Dinosaur getById(int id);

	List<Dinosaur> getAll();

	Dinosaur findByName(String name);

	Dinosaur create(Dinosaur dino);

	Dinosaur update(int id, String name, String species, Integer age);

	void delete(int id);

}