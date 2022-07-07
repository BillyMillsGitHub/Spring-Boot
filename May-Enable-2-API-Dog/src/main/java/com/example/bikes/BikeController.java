package com.example.bikes;






import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {

	private List<Bike> bike = new ArrayList<>();

	@GetMapping("/helloBike")
	public String helloWorld() {
		String a = "This is a controller test about bikes! ";
		String b = "This is a second paragraph";
		return a + b;
	}

	@GetMapping("/demoBike")
	public Bike getDemoBike() {
		return new Bike(1, "GT", "Orange", "Mountain");
	}

	@PostMapping("/createBike")
	public Bike create(@RequestBody Bike bike) {
		System.out.println("Created: " + bike);
		this.bike.add(bike);
		return this.bike.get(this.bike.size() - 1);
	}

	@PatchMapping("/updateBike/{id}")
	public void update(@PathVariable("id") int id, @PathParam("Brand") String brand, @PathParam("colour") String colour, @PathParam("type") String type,
			@PathParam("age") int age) {
		System.out.println("id: " + id);
		System.out.println("Brand: " + brand);
		System.out.println("Colour: " + colour);
		System.out.println("type: " + type);
	}

	// id = 1
	@DeleteMapping("/removeBike/{ID}")
	public void delete(@PathVariable int id) {
		System.out.println("id: " + id);
	}
}

