package TestNg;

import org.testng.annotations.Test;

public class ExceptionInTestng {

	@Test(expectedExceptions =ArithmeticException.class)
	public void Test1() {
		int i=2;
		System.out.println(i/0);
	}
}
