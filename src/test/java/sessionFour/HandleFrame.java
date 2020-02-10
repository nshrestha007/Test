package sessionFour;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleFrame {

	@Test
	public void HandleIFrame() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//Go to https://docs.oracle.com/javase/8/docs/api/
		//click on java.awt.color
		//click on ICC_ColorSpace link
		//click on serializable link.
		//verify Interface Serializable displayed
		driver.get("https://docs.oracle.com/javase/8/docs/api/");
		Thread.sleep(3000);
		//switch by index
		//switch by name
		//driver.switchTo().frame(0);
		driver.switchTo().frame("packageListFrame");
		Thread.sleep(3000);
		driver.findElement(By.linkText("java.awt.color")).click();
		//move the driver to default frame
		driver.switchTo().defaultContent();
		//new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("packageFrame")));
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("ICC_ColorSpace")).click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		WaitForElement(driver,60,By.linkText("Serializable"));
		driver.findElement(By.linkText("Serializable")).click();
		driver.close();
		driver.quit();
	}
	private void WaitForElement(WebDriver driver, int waitTime,By ElementLocator) {
		WebDriverWait wait = new WebDriverWait(driver,waitTime);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(ElementLocator));
		
		
	}
}
