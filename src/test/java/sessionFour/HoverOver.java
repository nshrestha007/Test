package sessionFour;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverOver {
	WebDriver driver;

	@Before
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.dell.com/en-us");

	}

	@Test

	public void hoverOver() throws InterruptedException {
		// Element Library
		WebElement DEALS_MENU_ELEMENT = driver.findElement(By.xpath("//button[@id='l1_4']"));
		By WORKSTATION_DEALS_LOCATOR = By.linkText("Worstation Deals");
		Actions action = new Actions(driver);
		action.moveToElement(DEALS_MENU_ELEMENT).build().perform();
		Thread.sleep(3000);
		driver.findElement(WORKSTATION_DEALS_LOCATOR).click();

	}

	@Test

	public void hoverOver1() throws InterruptedException {
		// Element Library
		WebElement DEALS_MENU_ELEMENT = driver.findElement(By.xpath("//button[@id='l1_4']"));
		By WORKSTATION_DEALS_LOCATOR = By.linkText("Workstation Deals");
		Actions action = new Actions(driver);
		action.moveToElement(DEALS_MENU_ELEMENT).build().perform();
		Thread.sleep(3000);
		driver.findElement(WORKSTATION_DEALS_LOCATOR).click();
	}

	@After
	public void closeEverything() {
		driver.close();
		driver.quit();

	}

}
