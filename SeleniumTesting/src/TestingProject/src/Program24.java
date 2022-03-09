import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Program24 {
	
	WebDriver driver;
	public void screenshot() throws IOException {
		
		TakesScreenshot scrShot = ((TakesScreenshot)driver);
		File ScrFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("B:\\work space\\TestingProject\\Screenshot\\facebook.png");
		FileUtils.copyFile(ScrFile, DestFile);
	}

}
