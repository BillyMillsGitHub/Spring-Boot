package com.example.demo.repo;



	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.example.demo.entity.Dinosaur;

	@Repository
	public interface DinoRepo extends JpaRepository<Dinosaur, Integer> {

		Dinosaur findByNameStartingWithIgnoreCase(String name);
	}

