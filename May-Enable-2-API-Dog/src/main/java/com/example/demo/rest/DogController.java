package com.example.demo.rest;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Dog;
import com.example.demo.service.DogService;



@RestController
public class DogController {

	
@Autowired
private DogService service; //dependency




	@GetMapping("/helloDog")
	public String helloWorld() {
		String a = "This is a controller test about dogs! ";
		String b = "This is a second paragraph";
		return a + b;
	}

	@GetMapping("/demoDog")
	public Dog getDemoDog() {
		return new Dog("Dave", "Black", "Labrador", Integer.MAX_VALUE);
	}
	@GetMapping("/getDog")
	public ResponseEntity<List<Dog>> getAll() {
		return new ResponseEntity<List<Dog>>(this.service.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/getDogById/{id}")
	public Dog getById(@PathVariable Integer id) {
		return this.service.getById(id);
	}
	
	
	@PostMapping("/createDog")
	public ResponseEntity<Dog> create(@RequestBody Dog dog) {
		
		System.out.println("Created: " + dog);
		Dog created = this.service.create(dog);
		return new ResponseEntity<Dog>(created, HttpStatus.CREATED);
	}
	
	
	

	@PatchMapping("/updateDog/{id}")
	public Dog update(@PathVariable Integer id, @PathParam("name") String name, @PathParam("colour") String colour,
			@PathParam("species") String species, @PathParam("age") Integer age) {
	return this.service.update(id, name, colour, species, age);

	}

	// id = 1

	@DeleteMapping("/removeDog/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		System.out.println("ID: " + id);
		this.service.delete(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}