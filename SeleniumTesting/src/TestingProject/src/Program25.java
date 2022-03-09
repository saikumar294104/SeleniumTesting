import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Program25 {
	
	@Test
	public void launch() throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\294104\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate the URL
		//driver.get("https://www.facebook.com");
		//takeScreenshot(driver, "facebook");
	}

	
	protected void takeScreenshot(WebDriver driver, String string) throws IOException {
		// TODO Auto-generated method stub
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File ScrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("B:\\work space\\TestingProject\\Screenshot\\facebook.png");
		FileUtils.copyFile(ScrFile, DestFile);
		
	}

}
