package be.davidh.myUnitTestProject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class CalculatorTest {
	
	@Test
	void testMultiplyExceptionIsThrown() {
	    Calculator calculator = new Calculator();
	    assertThrows(IllegalArgumentException.class, () -> {calculator.multiply(1001, 15);});
	}

	  @Test
	  public void testMultiply() {
		Calculator calculator = new Calculator();
		assertEquals(50,  calculator.multiply(10, 5),"10 x 5 must be 50");
	  }

	@Test
	void testSum() {
		Calculator calculator = new Calculator();
		assertEquals(15,  calculator.sumWrong(10, 5),"10 + 5 must be 15");
	}
	
	
	public static int[][] testDataSum() {
        return new int[][] { { 1 , 2, 3 }, { 5, 8, 13 }, { 120, 40, 160 } };
    }

    @ParameterizedTest
    @MethodSource("testDataSum")
    void testWithStringParameter(int[] data) {
    	Calculator calculator = new Calculator();
        assertEquals(data[2],  calculator.sum(data[0], data[1]), "10 + 5 must be 15");
    }
    
    

}
