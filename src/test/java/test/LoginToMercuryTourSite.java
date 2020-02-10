/**
 * 
 */
package test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author nshrestha
 *
 */
public class LoginToMercuryTourSite {

	
	@Test
	public void openGoogleSite() {
		//Setting ChromeDriver properties
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	
		//Create an object of chromeDriver
		WebDriver driver = new ChromeDriver();
	//Go to Google site
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.name("mercurysignoff.php")).click();
		driver.close();
		driver.quit();
	
	}
}
