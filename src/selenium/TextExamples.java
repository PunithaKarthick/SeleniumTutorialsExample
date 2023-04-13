package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/prakhulpragalyaa/Documents/Punithavathi/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		
		
		WebElement emailBox=driver.findElement(By.id("email"));
		emailBox.sendKeys("punitha@test.com");
		
		
		WebElement appendBox = driver.findElement (By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		appendBox.sendKeys("punitha");
		
		
		WebElement textBox = driver.findElement (By.name("username"));
		String value = textBox.getAttribute("value");
		System.out.println(value);
		
		
		WebElement clearBox = driver.findElement (By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearBox.clear();
		
		WebElement disabledBox = driver.findElement (By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled = disabledBox.isDisplayed();
		System.out.println(enabled);
		
	} 

}
