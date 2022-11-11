package junit.tutorial.ex02.e01;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		FizzBuzz fb = new FizzBuzz();
		List<String> result = new ArrayList<String>();
		result.add("1");
		result.add("2");
		result.add("Fizz");
		result.add("4");
		result.add("Buzz");
		result.add("Fizz");
		result.add("7");
		result.add("8");
		result.add("Fizz");
		result.add("Buzz");
		result.add("11");
		result.add("Fizz");
		result.add("13");
		result.add("14");
		result.add("FizzBuzz");
		result.add("16");
		assertIterableEquals(result,fb.createFizzBuzzList(16));
		
		
	}

}
