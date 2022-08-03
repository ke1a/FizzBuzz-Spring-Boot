package com.example.FizzBuzz;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FizzBuzzApplicationTests {

	@Autowired
	private FizzBuzzController controller;

	// prüfen ob controller erstellt wird
	@Test
	void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
