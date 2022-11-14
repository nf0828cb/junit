package junit.tutorial.ex03.e02;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class LogAnalyzerTest {


	@InjectMocks
	private LogAnalyzer logAnalyzer = new LogAnalyzer();
	
	@Mock
	private LogLoader mockloader;

	@Test
	void test() throws Exception{
		
		doReturn()
	}
	
	@Test
	void testNotFound() throws Exception{
		
	}

}
