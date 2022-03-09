import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\294104\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043916!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=CjwKCAiA6seQBhAfEiwAvPqu11mUwO7wPGnVmqCKchabkyXqyGImGgs1cuXKFcy4PzySbxofufAEEhoCRkwQAvD_BwE");
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7997297060");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Sai@1998");
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("dell");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class=\"_4rR01T\"])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2U9uOA _3v1-ww\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"_3SkBxJ\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2ObVJD _3AWRsL\"]")).click();

		
	}

}
