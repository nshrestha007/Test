package sessionFour;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PopUpTest {

	@Test
	public void handlePopUp() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		// Go to Rediff Site
		// Click on the go button
		// Close the popup
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form[@name='loginform']/descendant::input[@value='Sign in']")));
		driver.findElement(By.xpath("//form[@name='loginform']/descendant::input[@value='Sign in']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		
	}

}
