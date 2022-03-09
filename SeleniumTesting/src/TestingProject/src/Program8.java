import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Program8 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\294104\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		WebElement country = driver.findElement(By.xpath("//select[@name=\"country\"]"));
		Select obj = new Select(country);
		obj.selectByValue("IN");
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@name=\"Month\"]"));
		Select obj1 = new Select(month);
		obj1.selectByValue("Ma");
		
	}
	

}
