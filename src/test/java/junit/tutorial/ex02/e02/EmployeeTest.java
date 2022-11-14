package junit.tutorial.ex02.e02;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmployeeTest {


	@Test
	void test1() {
	
		InputStream input = getClass().getResourceAsStream("Employee.txt");
		List<Employee> empList = Employee.load(input);
		Employee emp = empList.get(0);
		assertEquals("Ichiro",emp.getFirstName());
	}
	@Test
	void test2() {
		
		InputStream input = getClass().getResourceAsStream("Employee.txt");
		List<Employee> empList = Employee.load(input);
		Employee emp = empList.get(0);
		assertEquals("Tanaka",emp.getLastName());

	}
	
	@Test
	void test3() {
		
		InputStream input = getClass().getResourceAsStream("Employee.txt");
		List<Employee> empList = Employee.load(input);
		Employee emp = empList.get(0);
		assertEquals("ichiro@example.com",emp.getEmail());
		
	}
	
}
