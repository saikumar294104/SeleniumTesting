import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program27 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\294104\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("total number of frames" +frames.size());
		driver.switchTo().frame(1);
		
		String title = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(title);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(2);
		String text = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(text);
		
		
	}

}
