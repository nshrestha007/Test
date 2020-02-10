package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	@Test
	public void openGoogleSite() {
		//Setting ChromeDriver properties
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
		//Create an object of chromeDriver
		WebDriver driver = new ChromeDriver();
	//Go to Google site
		driver.get("https://www.google.com/");
		
	}
	
	
}
