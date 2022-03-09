import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program21 {
	
	WebDriver driver;
	public void launch() {
		
		System.setProperty("webdriver.gecko.driver", "B:\\softwares\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
	    driver = new FirefoxDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/V4/");
	}
	
	public String Title() {
		return driver.getTitle();
		
	}
	
	public String URL() {
		return driver.getCurrentUrl();
	}

}
