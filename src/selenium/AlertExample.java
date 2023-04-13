package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/prakhulpragalyaa/Documents/Punithavathi/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Alert.html");
		
		WebElement alertBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		
		alertBox.click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.accept();

		WebElement confirmButton = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		
		confirmButton.click();
		
		Alert confirmAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		confirmAlert.dismiss();
		
		WebElement prompBox = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		prompBox.click();
		
		
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Duckling");
		Thread.sleep(3000);
		promptAlert.accept();
		Thread.sleep(3000);
		
		promptAlert.accept();
		
		
		
		
	}

}
