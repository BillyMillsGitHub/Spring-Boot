package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Dog;
import com.example.demo.repo.DogRepo;

@Service
@Primary
public class DogServiceDB implements DogService {
	@Autowired
	private DogRepo repo;

	@Override
	public Dog getById(Integer id) {
		// TODO Auto-generated method stub
		return this.repo.findById(id).get();
	}

	@Override
	public List<Dog> getAll() {
		// TODO Auto-generated method stub
		return this.repo.findAll();
	}

	@Override
	public Dog create(Dog dog) {
		// TODO Auto-generated method stub
		return this.repo.save(dog);
	}

	@Override
	public Dog update(Integer id, String name, String colour, String species, Integer age) {
		// TODO Auto-generated method stub
		Dog toUpdate = this.getById(id);
		if (name != null)
			toUpdate.setName(name);
		if (colour != null)
			toUpdate.setColour(colour);
		if (age != null)
			toUpdate.setAge(age);
		if (species != null)
			toUpdate.setSpecies(species);

		return this.repo.save(toUpdate);
	}

	@Override
	public void delete(Integer id) {
		this.repo.deleteById(id);

	}

}
