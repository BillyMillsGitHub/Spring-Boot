package com.example.demo.animal;

import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;


@Service
@Primary
public abstract class DogServiceList implements DogService {

	

		private List<Dog> dog;

		@Override
		public Dog getById(int id) {
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
		public Dog update(int id, String name,String colour,String species, Integer age) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void delete(int id) {
			// TODO Auto-generated method stub
		
		}

		}

		