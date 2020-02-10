package locatorsAndElements;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VariousLocatorsAndElements {

	@Test
	public void searchCustomer() throws InterruptedException {

		// Setting ChromeDriver properties
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

		// Create an object of chromeDriver
		WebDriver driver = new ChromeDriver();

		// go to techfios website
		driver.get("http://objectspy.space/");

		// maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Clear the search field
		//driver.findElement(By.className("search")).clear();

		// Type TechFios in the search field
		//driver.findElement(By.className("search")).sendKeys("TechFios");
		// Click on a linked text(Display in different color or text)
		// will always have a tagname "a" and URL.
		//driver.findElement(By.linkText("Link Test : New Page")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.partialLinkText("OS-API")).click();
		Thread.sleep(3000);
		
		//Examples of cssSelector
		//driver.findElement(By.cssSelector("input[title='Search']")).click();
		Thread.sleep(3000);
		
		
		//absolute xpath example
		//starts with HTML tag
		//driver.findElement(By.xpath("html/body/div/div[2]/div/form/div[4]/a")).click();
		
		//Relative xpath example from radio button male
//		driver.findElement(By.xpath("//input[@value='Male']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@value='Female']")).click();
	
		//Relative xpath with function text()
		//driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		//Relative xpath with function contains()
		driver.findElement(By.xpath("//*[contains(text(),' New Page')]")).click();
		//xpath with "and"
		//*[contains(text(),'Link Test')and contains(text(),'New Page')]
		//label[@class='checkbox'and contains(text(),'Automation')]
		// driver.close will close the browser
		driver.close();
		// driver.quit will end the test
		//driver.quit();

	}

}
