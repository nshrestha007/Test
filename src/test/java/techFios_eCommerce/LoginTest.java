package techFios_eCommerce;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTest {
	String expectedCondition = "Dashboard";
	@Test

	public void loginTechFios() {

		
		// Setting ChromeDriver properties
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		// Create an object of chromeDriver
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// go to techfios website
		driver.get("http://techfios.com/test/billing/?ng=login/");
		// for identifying a certain element we are using findElement
		// for typing in the element we are using sendKeys
		driver.findElement(By.id("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		// use use .click to click on an element
		driver.findElement(By.name("login")).click();
		//display dashboard
		//driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]")).click();
		WebElement dashboardTitle =driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
		//dashboardTitle.click();
		//Explicit wait (method)
		waitFor(dashboardTitle,driver);

		if(dashboardTitle.isDisplayed()) {
			System.out.println("Test pass");
		}
		else {
			System.out.println("Test failed");
		}
		// driver.close will close the browser
		driver.close();
		// driver.quit will end the test
		driver.quit();

	}

	public static void waitFor(WebElement Element, WebDriver Driver1) {
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(Driver1,10);
		wait.until(ExpectedConditions.visibilityOf(Element));
		
	}
}
