package be.davidh.myUnitTestProject;

public class Calculator {

	public int multiply(int x, int y) {
		// the following is just an example
		if (x > 999) {
			throw new IllegalArgumentException("X should be less than 1000");
		}
		return x * y;
	}
	
	public int sum(int x, int y) {
		return x + y;
	}
	
	
	public int sumWrong(int x, int y) {
		return x + y + 1;
	}
	

}
