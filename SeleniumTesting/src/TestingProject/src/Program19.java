import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Program19 {
	
	WebDriver driver;

	@Parameters("browser")
	@BeforeMethod
	public void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\294104\\Documents\\chromedriver_win32\\chromedriver.exe");
		    driver = new ChromeDriver();
			
			//maximize the browser
			driver.manage().window().maximize();
			}
			
			else if(browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "B:\\softwares\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			    driver = new FirefoxDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
			}
	}
	
		public void navigateToURL(String url) {
			driver.navigate().to(url);

		
		
		}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	
	
	@Test
	public void handlefacebook() throws InterruptedException {
		navigateToURL("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("sai");
		driver.findElement(By.xpath("//input[@name=\"lastname\"]")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id=\"password_step_input\"]")).sendKeys("sai123");
		

	}
	
	@Test
	public void handlegoogle() {
		navigateToURL("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Java and Selenium" +Keys.ENTER);
		driver.findElement(By.xpath("//h3[text()='Selenium Tutorial - javatpoint']")).click();
		driver.getTitle();
		driver.getCurrentUrl();
		driver.getPageSource();
		
	}
		
	}
	
	
	


