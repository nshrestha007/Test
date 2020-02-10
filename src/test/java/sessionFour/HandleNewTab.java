package sessionFour;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleNewTab {

	WebDriver driver;

	@Before
	public void handleNewTab() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.yahoo.com/");
	}

	@Test
	public void searchForXpathInYahoo() {
		By SEARCH_FIELD_LOCATOR = By.cssSelector("input#header-search-input");
		By W3_LINK_LOCATOR = By.linkText("XPath Tutorial - w3schools.com");
		By SQL_LINK_LOCATOR = By.linkText("SQL");
		// System.out.println(driver.getWindowHandles());

		driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys("xpath");
		driver.findElement(SEARCH_FIELD_LOCATOR).sendKeys(Keys.ENTER);// to press Enter
		new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(W3_LINK_LOCATOR));
		driver.findElement(W3_LINK_LOCATOR).click();
		// System.out.println(driver.getWindowHandles());

		for (String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
		}
		driver.findElement(SQL_LINK_LOCATOR).click();

	}

	@After
	public void closeEverything() {
		driver.close();
		driver.quit();

	}

}
