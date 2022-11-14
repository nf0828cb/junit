package junit.tutorial.ex03.e01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class MonthlyCalendarTest {

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

//	@Test
//	void test() {
//		MonthlyCalendar mc = new MonthlyCalendar();
//		int result = mc.getRemainingDays();
//		assertEquals(16,result);
//	}
	
	@ParameterizedTest
	@CsvSource
	({
		"2012-12-31,0",
		"2012-01-30,1",
		"2012-02-01,28",
	})
	void test(LocalDate day,int result) {
		MonthlyCalendar mc = new MonthlyCalendar(day);
		assertEquals(result, mc.getRemainingDays());
	}

}
