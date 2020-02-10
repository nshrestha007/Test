package techFios_eCommerce;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import junit.framework.Assert;

public class AddDeposit {

	@Test
	public void UsershouldBeAbleToMakeADeposit() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='col-xs-8 text-right']//a[contains(text(),'Add Deposit')]")).click();
		driver.findElement(By.xpath("//select/descendant::option[@value='SHAJU']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text'][@name='description']")).sendKeys("Payment");
		driver.findElement(By.xpath("//input[@name='amount']")).sendKeys("100");
		driver.findElement(By.xpath("//button[@type='submit'][@id='submit']")).click();
		// driver.findElement(By.linkText("Payment")).click();//validating using linkText
		// Validating using Explicit wait
		String DepValidator = "//table[@class='table table-bordered sys_table']/descendant::a[contains(text(),'Payment')]";
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(DepValidator)));
		//Thread.sleep(5000);
		String Expected= "Payment";//Validating using Assertion
		String Actual = driver.findElement(By.xpath(DepValidator)).getText();
		Assert.assertEquals("failed", Expected, Actual);
		driver.close();
		driver.quit();
	}

}
