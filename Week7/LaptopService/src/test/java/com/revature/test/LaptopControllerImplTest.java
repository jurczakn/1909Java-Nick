package com.revature.test;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.revature.bean.Laptop;
import com.revature.controller.LaptopControllerImpl;
import com.revature.service.LaptopService;

@SpringBootTest
class LaptopControllerImplTest {
	
	@Mock
	LaptopService laptopService;
	
	@InjectMocks
	LaptopControllerImpl laptopControllerImpl;
	
	private MockMvc mvc;
	
	private Laptop newLaptop;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		this.mvc = MockMvcBuilders.standaloneSetup(laptopControllerImpl).build();
		newLaptop = new Laptop("testSerial", "Dell", "HP", 5.00, "some parts", 1, "yesterday", true);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCreateLaptop() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteLaptop() {
		fail("Not yet implemented");
	}

	@Test
	void testRepairLaptop() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLaptop() throws Exception {
		String serialNumber = "testSerial";
		when(laptopService.getLaptop(serialNumber)).thenReturn(Optional.of(newLaptop));
		mvc.perform(MockMvcRequestBuilders
				.get("/laptop/{serialNumber}", serialNumber)
				.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				.andExpect(MockMvcResultMatchers.jsonPath("$").value(newLaptop));
	}

}
