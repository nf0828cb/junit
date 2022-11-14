package junit.tutorial.ex02.e02;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class test {
	public static void main(String[] args) {
		
		test t = new test();
		t.execute();
		

	}
	
	public void execute() {
		InputStream input = getClass().getResourceAsStream("Employee.txt");
		InputStream bufferedStream = new BufferedInputStream(input);
		
		System.out.println();
	}

}
