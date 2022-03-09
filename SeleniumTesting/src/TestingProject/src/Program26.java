import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Program26 extends Program25 {
	
	WebDriver driver;
	@Test
	public void orange() throws IOException, InterruptedException {
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys("admin123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"btnLogin\"]")).click();
		Thread.sleep(2000);

		takeScreenshot(driver, "orangehrmlogin");
		
		driver.findElement(By.xpath("//a[@id=\"menu_leave_viewLeaveModule\"]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name=\"leaveList[calFromDate]\"]")).click();
		Thread.sleep(2000);
		
		WebElement from = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
		Select obj = new Select(from);
		obj.selectByVisibleText("May");
		Thread.sleep(2000);
		
		
		WebElement from1 = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
		Select obj1 = new Select(from1);
		obj1.selectByValue("2000");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\\\"calToDate\\\"]")).click();
		
		WebElement to = driver.findElement(By.xpath("//select[@class=\\\"ui-datepicker-month\\\"]"));
		Select obj2 = new Select(to);
		obj2.selectByVisibleText("june");
		Thread.sleep(2000);
		
		WebElement to1 = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-year\"]"));
		Select obj3 = new Select(to1);
		obj3.selectByValue("2000");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]")).click();
		
		WebElement sub = driver.findElement(By.xpath("//select[@id=\"leaveList_cmbSubunit\"]"));
		Select obj4 = new Select(sub);
		obj4.selectByVisibleText("Engineering");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id=\"leaveList_cmbWithTerminated\"]")).click();
		
		takeScreenshot(driver, "orange leave");
		


	}

}
