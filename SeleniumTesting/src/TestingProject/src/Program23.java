import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Program23 {
	
	@Test
	public void screen() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "B:\\softwares\\Drivers\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate the URL
		driver.get("https://www.facebook.com");
		takeScreenshot(driver, "facebook");
		
		
	}
	
	public void takeScreenshot(WebDriver driver,String name) throws IOException, InterruptedException {
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File ScrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("B:\\work space\\TestingProject\\Screenshot"+name+".png");
		FileUtils.copyFile(ScrFile, DestFile);

	}

}
