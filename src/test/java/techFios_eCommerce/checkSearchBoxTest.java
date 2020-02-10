package techFios_eCommerce;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkSearchBoxTest {

	@Test
	public void searchCustomer() throws InterruptedException {

		// Setting ChromeDriver properties
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Create an object of chromeDriver
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// go to techfios website
		driver.get("http://techfios.com/test/billing/?ng=login/");

		// for identifying a certain element we are using findElement
		// for typing in the element we are using sendKeys
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		Thread.sleep(3000);
		// use use .click to click on an element
		driver.findElement(By.name("login")).click();
		//Dash board page should be displayed.
		//driver.findElement(By.cla)
		
		

		driver.findElement(By.name("name")).sendKeys("Jack");
		Thread.sleep(3000);
		// driver.close will close the browser
		driver.close();
		// driver.quit will end the test
		driver.quit();

	}

}
