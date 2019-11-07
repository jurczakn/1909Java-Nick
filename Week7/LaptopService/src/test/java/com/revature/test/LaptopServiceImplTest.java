package com.revature.test;

import static org.hamcrest.CoreMatchers.everyItem;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.revature.bean.Laptop;
import com.revature.repo.LaptopRepo;
import com.revature.service.LaptopServiceImpl;


//@RunWith(MockitoJUnitRunner.class)  for non-spring boot application
@SpringBootTest
class LaptopServiceImplTest {
	
	@Mock
	LaptopRepo laptopRepo;
	
	@InjectMocks
	LaptopServiceImpl laptopServiceImpl = new LaptopServiceImpl();
	
	Laptop newLaptop;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		newLaptop = new Laptop("testSerial", "Dell", "HP", 5.00, "some parts", 1, "yesterday", true);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSetLaptopRepo() {
		fail("Not yet implemented");
	}

	@Test
	void testMakeLaptop() {
		when(laptopRepo.save(newLaptop)).thenReturn(newLaptop);
		assertEquals(newLaptop, laptopServiceImpl.makeLaptop(newLaptop));
		verify(laptopRepo).save(newLaptop);
	}

	@Test
	void testThrowLaptop() {
		fail("Not yet implemented");
	}

	@Test
	void testGetLaptop() {
		when(laptopRepo.findById("testSerial")).thenReturn(Optional.of(newLaptop));
		assertEquals(Optional.of(newLaptop), laptopServiceImpl.getLaptop("testSerial"));
	}

	@Test
	void testFixLaptop() {
		when(laptopRepo.save(newLaptop)).thenReturn(newLaptop);
		assertEquals(newLaptop, laptopServiceImpl.fixLaptop(newLaptop));
		verify(laptopRepo).save(newLaptop);
		assertFalse(newLaptop.isBroken());
	}

	@Test
	void testGetLaptopByManufacturer() {
		fail("Not yet implemented");
	}

}
