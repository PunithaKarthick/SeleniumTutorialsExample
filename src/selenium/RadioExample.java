package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/prakhulpragalyaa/Documents/Punithavathi/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/radio.html");
		
		WebElement unchecked = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[1]"));
		
		WebElement checked = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[2]/div/div/input[2]"));
		
		boolean status1 = unchecked.isSelected();
		boolean status2 = checked.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);
		
		
		WebElement below20 = driver.findElement(By.name("age"));
		below20.click();
		
		
		
		

		

	}

}
