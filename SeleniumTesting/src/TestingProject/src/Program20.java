import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;

public class Program20 {
	
	public String readData(String key) throws IOException {
		Properties properties = new Properties();
		FileInputStream fileInputStream = new FileInputStream("B:\\work space\\TestingProject\\Amazon.properties");
		properties.load(fileInputStream);
		String value = properties.getProperty(key);
		return value;
	}
	
	
	public static ChromeDriver driver;
	@Test
	public void handleAmazon() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\294104\\Documents\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&prevRID=639M73F2PZVDRY82TBH8&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"ap_customer_name\"]")).sendKeys(readData("name"));
		driver.findElement(By.xpath("//input[@id=\"ap_phone_number\"]")).sendKeys(readData("phone"));
		driver.findElement(By.xpath("//input[@id=\"ap_password\"]")).sendKeys(readData("password"));
		
	}

}
