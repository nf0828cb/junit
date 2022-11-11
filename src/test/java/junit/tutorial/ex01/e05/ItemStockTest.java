package junit.tutorial.ex01.e05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ItemStockTest {

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
	
	ItemStock itemStock = new ItemStock();
	Item cd = new Item("CD",500);
	Item dvd = new Item("DVD",1000);
	
	
	@Test
	void test1() {
		int result = itemStock.getNum(cd);
		assertEquals(0,result,"test1の在庫数が異なります");
	}
	
	@Test
	void test2() {
			itemStock.add(cd);
			int result = itemStock.getNum(cd);
			assertEquals(1,result,"test2の在庫数が異なります");
		}
	@Test
	void test3() {
		itemStock.add(cd);
		int result = itemStock.getNum(cd);
		assertEquals(1,result,"test3の在庫数が異なります");
	}
	
	@Test
	void test4() {
		itemStock.add(cd);
		itemStock.add(cd);
		int result = itemStock.getNum(cd);
		assertEquals(2,result,"test4の在庫数が異なります");
	}
	
	@Test
	void test5() {
		itemStock.add(dvd);
		int result = itemStock.getNum(dvd);
		assertEquals(1,result,"test5の在庫数が異なります");
	}
}

