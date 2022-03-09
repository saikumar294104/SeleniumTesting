import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program13 extends Program12 {
	
	public void Text() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.programiz.com/c-programming/examples");
		System.out.println("Title of the page" +driver.getTitle());
	}
	
	public static void main(String[] args) throws InterruptedException {
		Program13 ss = new Program13();
		ss.launchBrowser();
		ss.Text();
	}

}
