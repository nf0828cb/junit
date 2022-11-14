package junit.tutorial.ex01.e01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class StringUtilsTest {


	@Test
	void test1() {
		String result = StringUtils.toSnakeCase("aaa");
		assertEquals("aaa", result,"test1の結果が異なります");
	}
	
	@Test
	void test2() {
		String result = StringUtils.toSnakeCase("HelloWorld");
		assertEquals("hello_world", result,"test2の結果が異なります");
	}
	
	@Test
	void test3() {
		String result = StringUtils.toSnakeCase("practiceJunit");
		assertEquals("practice_junit", result,"test3の結果が異なります");
	}

}
