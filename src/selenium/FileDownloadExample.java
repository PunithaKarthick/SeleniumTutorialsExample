package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/prakhulpragalyaa/Documents/Punithavathi/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/download.html");
		
	/*	WebElement downloadLink = driver.findElement(By.linkText("Download xls"));
		downloadLink.click();
		
		Thread.sleep(3000);
		
		File fileLocation = new File("/Users/prakhulpragalyaa/Downloads");
		File[] totalfiles = fileLocation.listFiles();
		
		for (File file :totalfiles )
		{
			if(file.getName().equals("download.xls")){
				System.out.println("File downloaded");
				break;
			}
		} */
		
		
		

	}

}
