package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicAnnotation {
	
	@Test
	public void FirstTest() {
		System.out.println("First Test");
	}
	@Test(enabled=false)
	public void SeconTestCase() {
		
	}
	
	@BeforeSuite
	public void suit() {
		System.out.println("Before Suit");
	}
	
	@AfterSuite
	public void aftersuit() {
		System.out.println("Before Suit");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After class");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("After Test");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before Method");
	}
	@AfterMethod
	public void AfterMetod() {
	System.out.println("After Method");
	}
	@BeforeGroups
	public void group() {
		System.out.println("Before group");
		
	}
	@AfterGroups
	public void Aftergroups() {
		System.out.println("Aftert group");
	}

}
