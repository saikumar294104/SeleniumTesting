
import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Program16 {
	
	public static void main(String[] args) throws IOException {
		
		//Launch Firefox Browser
				System.setProperty("webdriver.gecko.driver", "B:\\softwares\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				
				//maximize the browser
				driver.manage().window().maximize();
				
				//navigate the URL
				driver.get("https://www.facebook.com");
				
				
	}

}
