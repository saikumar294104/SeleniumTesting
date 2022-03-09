import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program7 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\294104\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Selenium Testing",Keys.ENTER);
		
		//Actions action = new Actions(driver);
		//action.sendKeys(Keys.PAGE_DOWN).build().perform();
		
		JavascriptExecutor ss = (JavascriptExecutor) driver;
		ss.executeScript("window.scrollBy(0,3000)");
		Thread.sleep(2000);

		
	    driver.findElement(By.xpath("//h3[text()='What is Selenium Testing? What are the various ... - Tools QA']")).click();
	    
	    String title = driver.getTitle();
	    System.out.println(title);

		
	}

}
