import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program3 {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\294104\\Documents\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.naukri.com/");
	
	driver.findElement(By.xpath("(//img[@class=\"logoImage\"])[1]")).click();
	driver.findElement(By.xpath("(//img[@class=\"logoImage\"])[2]")).click();

	driver.findElement(By.xpath("(//img[@class=\"logoImage\"])[3]")).click();
	
	String present = driver.getWindowHandle();
	System.out.println(present);
	Set<String> links = driver.getWindowHandles();
	ArrayList<String> alllinks = new ArrayList<String>(links);
	
	for(int i=0;i<alllinks.size(); i++) {
		driver.switchTo().window(alllinks.get(i));
		System.out.println(driver.getTitle());
	}
	
	 driver.switchTo().window(alllinks.get(1));
	    List<WebElement> title = driver.findElements(By.tagName("a"));
	    System.out.println(title.size());
	    for(int i=0;i<alllinks.size();i++) {
	    	System.out.println(title.get(i).getText());
	    }
	    
	    driver.switchTo().window(alllinks.get(0));
	    driver.switchTo().window(alllinks.get(2));
	    List<WebElement> title1 = driver.findElements(By.tagName("a"));
	    System.out.println(title1.size());
	    for(int i=0;i<alllinks.size();i++) {
	    	System.out.println(title1.get(i).getText());
	    }
	    
	    driver.switchTo().window(alllinks.get(0));
	    driver.switchTo().window(alllinks.get(3));
	    List<WebElement> title2 = driver.findElements(By.tagName("a"));
     System.out.println(title2.size());
     for(int i=0;i<alllinks.size();i++) {
	    	System.out.println(title2.get(i).getText());
	    }
	}
	

	

}

