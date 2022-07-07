package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Dog;


@Service

public abstract class DogServiceList implements DogService {

	

		private List<Dog> dog;

		@Override
		public Dog getById(Integer id) {
			return this.dog.get(id);

		}

		@Override
		public List<Dog> getAll() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Dog create(Dog dog) {
			this.dog.add(dog);
			return this.dog.get(this.dog.size() - 1);

		}

		@Override
		public Dog update(Integer id, String name,String colour,String species, Integer age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void delete(Integer id) {
			// TODO Auto-generated method stub
		
		}

		}

		