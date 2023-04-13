package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/prakhulpragalyaa/Documents/Punithavathi/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/autoComplete.html");
		
		
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("s");
		Thread.sleep(4000);
		
		List<WebElement> optionsList = driver.findElements(By.xpath("//*[@id='ui-id-1']/li"));
		
		//*[@id="ui-id-9"]
		System.out.println(optionsList.size());
		for (WebElement webElement : optionsList) {
			
			 System.out.println("Selected Element:"+webElement.getText());
		if ( webElement.getText().trim().equals("Selenium")) {
			 webElement.click();
			 System.out.println("Selected Element inside if block:"+webElement.getText());
			 break;
			}
			
		}
		

	}

}
