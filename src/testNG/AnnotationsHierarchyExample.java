package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class AnnotationsHierarchyExample {
	
	@Test
	public void test() {
		System.out.println("Im an in Test");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Im an in Before Methd");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("Im an in After Methd");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("Im an in Before Class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("Im an in After Class");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Im an in Before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Im an in After Suite");
	}
}
