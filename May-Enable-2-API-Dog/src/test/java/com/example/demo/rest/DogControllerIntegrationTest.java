package com.example.demo.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.example.demo.entity.Dog;
import com.fasterxml.jackson.databind.ObjectMapper;
@Sql(scripts = { "classpath:Dog_schema.sql", "classpath:Dog_data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)
@SpringBootTest
@AutoConfigureMockMvc // sets up the testing class
public class DogControllerIntegrationTest {

	@Autowired
	private MockMvc mvc;

	@Autowired
	private ObjectMapper mapper;

	private int add(int a, int b) {
		return a + b;
	}

	@Test
	void testDemo() {
		assertEquals(2, add(1, 1));
	}

	@Test
	void testCreate() throws Exception {
		Dog testDog = new Dog("Bob", "Black", "Poodle", 3);
		String testDogAsJSON = this.mapper.writeValueAsString(testDog);
		RequestBuilder req = post("/createDog").content(testDogAsJSON).contentType(MediaType.APPLICATION_JSON);

		ResultMatcher checkStatus = MockMvcResultMatchers.status().is(201);
		Dog createdDog = new Dog("Bob", "Black", "Poodle", 3);
		String createdDogAsJSON = this.mapper.writeValueAsString(createdDog);
		ResultMatcher checkBody = MockMvcResultMatchers.content().json(createdDogAsJSON);

		this.mvc.perform(req).andExpect(checkStatus).andExpect(checkBody);
	}
//	@Test
//	void TestUpdate() throws Exception {
//		Dog updateDog = new Dog(2, "Jeff", "White", "Westie", 2);
//		String updateDogasJSON = this.mapper.writeValueAsString(updateDog);
//		ResultMatcher checkBody = MockMvcResultMatchers.content().json(updateDogasJSON);
//		
//		this.mvc.perform(req).andExcept(checkStatus).andExcept(checkBody);
//	}
	@Test
	void testDelete() throws Exception {
		this.mvc.perform(delete("/removeDog/1")).andExpect(status().isNoContent());
	}	
}
