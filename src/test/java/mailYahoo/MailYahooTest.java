package mailYahoo;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MailYahooTest {
	
	@Test
	public void LoginToMailYahoo() {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=ym&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd");
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("n_shre");
		driver.findElement(By.cssSelector("input[value='Next']")).click();
		driver.findElement(By.cssSelector("//input[@type='password']")).sendKeys("Romiedujay");
		driver.findElement(By.cssSelector("//button[@name='verifyPassword']")).click();
		
	}	

}
