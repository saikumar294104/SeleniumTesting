import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Program18 {
	
WebDriver driver = null;
	
	@Parameter(description = "browsername")
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
		
		public void navigateToURL() {
			driver.get("https://www.facebook.com");
		}
		
		public String printTitle() {
			return driver.getTitle();
			
		}
		
		public String printURL() {
			return driver.getCurrentUrl();
		}
		
		@Test
		public void Testcase() {
			launchBrowser("chrome");
			navigateToURL();
			System.out.println("title of the page is " +printTitle());
			System.out.println("url of the page is " +printURL());
					
		}
		
		@Test
		public void Testcase1() {
			launchBrowser("firefox");
			navigateToURL();
			System.out.println("title of the page is " +printTitle());
			System.out.println("url of the page is " +printURL());
					
		}

}
