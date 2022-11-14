package junit.tutorial.ex02.e04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvSource;

class ConsumptionTest {

	@ParameterizedTest
	@CsvSource({
		"5,100,105",
		"5,3000,3150",
		"10,50,55",
		"5,50,52",
		"3,50,51",
	})
	void test(int f,int s,int t) {
		ConsumptionTax tax = new ConsumptionTax(f);
		int result = tax.apply(s);
		assertEquals(t,result);
	}

}
