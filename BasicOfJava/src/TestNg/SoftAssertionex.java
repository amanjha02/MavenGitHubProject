package TestNg;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionex {
	
	@Test
	public void SoftAssertionex1() {
		System.out.println("Before Assertion");
		SoftAssert softaasertionex=new SoftAssert();
		boolean bool=true;
		softaasertionex.assertTrue(false);
		System.out.println("After soft assertion ");
		softaasertionex.assertAll();
	}
	
	@Test
	public void SoftAssertionex11() {
		System.out.println("Before Assertion");
		SoftAssert softaasertionex=new SoftAssert();
		String  str="Aman";
		softaasertionex.assertEquals("Aman", str);;
		System.out.println("After soft assertion ");
		softaasertionex.assertAll();
	}

}
