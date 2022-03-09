import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Program15 {
	
	private WebDriver driver;
	
	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\294104\\Documents\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();

		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate the URL
		driver.get("https://www.google.com");
	}
	
	@Test
	public void data() throws InterruptedException {
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Programming on c" +Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//h3[@class=\"LC20lb MBeuO DKV0Md\"])[2]")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Size of the links " +links.size());
	}
	
	@AfterTest
	public void closing() {
		 driver.quit();
	}

}
