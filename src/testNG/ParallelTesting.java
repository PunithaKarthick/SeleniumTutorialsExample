package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	@Test
	public void openGoogle() {
				
		
	System.setProperty("webdriver.chrome.driver", "/Users/prakhulpragalyaa/Documents/Punithavathi/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();	
	driver.get("http://www.google.co.in");
	driver.quit();
	}
	
	@Test
	public void openBing() {
		
	System.setProperty("webdriver.chrome.driver", "/Users/prakhulpragalyaa/Documents/Punithavathi/Selenium/chromedriver");
	WebDriver driver = new ChromeDriver();	
	driver.get("http://www.bing.com");
	driver.quit();
	}

}
