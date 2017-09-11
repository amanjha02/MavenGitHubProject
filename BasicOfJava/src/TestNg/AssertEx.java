package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEx {
	@Test
	
	public void Asserionexample() {
		String str="Aman";
		Assert.assertEquals(str, "Aman","string not matched");
		Assert.assertEquals(str, "Aman");
		
	
	}
	
	@Test
	public void Assertionexample2() {
		boolean bool=true;
		boolean bool1=false;
	Assert.assertTrue(false,"True condtion matched");
	Assert.assertFalse(bool1);
	}
	

}
