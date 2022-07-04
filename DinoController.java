package com.example.demo.animal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DinoController {

	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello, World!";
}
}