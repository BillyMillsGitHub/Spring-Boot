package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Dog;

@Repository
public interface DogRepo extends JpaRepository<Dog, Integer> {

	Dog findByNameStartingWithIgnoreCase(String name);
}

