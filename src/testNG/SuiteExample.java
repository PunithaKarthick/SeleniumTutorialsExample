package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {
	WebDriver driver;
	long startTime;
	
	@BeforeSuite
	public void launchBrowser() {
		startTime = System.currentTimeMillis();
		
		System.setProperty("webdriver.chrome.driver", "/Users/prakhulpragalyaa/Documents/Punithavathi/Selenium/chromedriver");
		driver = new ChromeDriver();
	}
	
	@Test
	public void openGoogle() {
				
	driver.get("http://www.google.co.in");
	}
	
	@Test
	public void openBing() {
			
	driver.get("http://www.bing.com");
	}
	
	@Test
	public void openYahoo() {
				
	driver.get("http://www.yahoo.com");
	}
	
	
	@AfterSuite
	public void closeBrowser() {
		
		driver.quit();
		long endTime = System.currentTimeMillis();
		long totalTime = endTime-startTime;
		System.out.print("Total Time taken :"+totalTime);
		
	}

}
