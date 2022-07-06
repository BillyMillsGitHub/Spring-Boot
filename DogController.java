package com.example.demo.animal;

import java.util.ArrayList;
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



@RestController
public class DogController {

	
@Autowired
private com.example.demo.animal.DogService service; //dependency


private List<Dog> Dog = new ArrayList<>();

	@GetMapping("/helloDog")
	public String helloWorld() {
		String a = "This is a controller test about dogs! ";
		String b = "This is a second paragraph";
		return a + b;
	}

	@GetMapping("/demoDog")
	public Dog getDemoDog() {
		return new Dog(0, "Dave", "Black", "Labrador", Integer.MAX_VALUE);
	}
	
	@GetMapping("/getDog/{id}")
	public Dog getById(@PathVariable int id) {
		return this.service.getById(id);
	}
	//
	@GetMapping("/getDog")
	public List<Dog> getAll() {
		return this.Dog;
	}

	
	
	@PostMapping("/createDog")
	public ResponseEntity<Dog> create(@RequestBody Dog dog) {
		System.out.println("Created: " + dog);
		this.Dog.add(dog);
		Dog created = this.Dog.get(this.Dog.size() - 1);

		return new ResponseEntity<Dog>(created, HttpStatus.CREATED);
	}
	
	
	

	@PatchMapping("/updateDog/{id}")
	public Dog update(@PathVariable("id") int id, @PathParam("name") String name, @PathParam("colour") String colour,
			@PathParam("species") String species, @PathParam("age") int age) {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Colour: " + colour);
		System.out.println("Species: " + species);
		System.out.println("Age: " + age);

		Dog toUpdate = this.Dog.get(id);
		if (name != null)
			toUpdate.setName(name);
		if (colour != null)
			toUpdate.setColour(colour);
		if (species != null)
			toUpdate.setSpecies(species);
		return toUpdate;
	}

	// id = 1

	@DeleteMapping("/removeDog/{id}")
	public ResponseEntity<?> delete(@PathVariable int id) {
		System.out.println("ID: " + id);
		this.Dog.remove(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
}