package TestNg;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class FailedTestCase {
	
	@Test
	public void passedTestCase() {
		Assert.assertTrue(true);
	}
	

	@Test
	public void FailedTestCase() {
		Assert.assertTrue(false);
	}
	
	@Test
	public void SkippedTestcase() {
		throw new SkipException("Skip test case for some reason");
	}

}
