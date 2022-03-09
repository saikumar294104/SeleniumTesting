import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Program17 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "B:\\softwares\\Drivers\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//navigate the URL
		driver.get("https://www.facebook.com");
		
	}

}
