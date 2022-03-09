import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class Program2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\294104\\Documents\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=16222422908317384199&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007743&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=EAIaIQobChMI4bfa2_6P9gIVk9GWCh2mYgIxEAAYASAAEgKkhPD_BwE");
	
	//Actions action = new Actions(driver);
	//action.sendKeys(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
	
	JavascriptExecutor ss = (JavascriptExecutor) driver;
	ss.executeScript("window.scrollBy(0,1500)");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//h2[@class=\"as-title-block-left\"])[1]")).getText();
	

}
}
