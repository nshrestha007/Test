package techFios_eCommerce;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoneyTransfer {

	@Test
	public void shouldBeAbleToTransferMoney() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("techfiosdemo@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@type='submit' and contains (text(),'Sign')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Tran')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Transfer')]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[@title='Choose an Account']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//option[@value='CheckingA/C79']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@id=\"taccount\"]//descendant::option[contains(text(),'housedown')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text'][@name='description']")).sendKeys("mortgage");
		driver.findElement(By.xpath("//input[@type='text'][@id='amount']")).sendKeys("1000");
		driver.findElement(By.xpath("//li[@class=\"select2-search select2-search--inline\"]//child::input")).sendKeys("Monthly");
		driver.findElement(By.xpath("//button[@type='submit'][@id='submit']")).click();
		String validateTransfer = "//table[@class='table table-bordered sys_table']//descendant::td";
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(validateTransfer)));
		
		driver.close();
		driver.quit();
	}
}
