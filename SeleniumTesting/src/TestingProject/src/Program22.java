import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Program22 extends Program21 {
	
	public void display() throws InterruptedException {
		LinkedHashSet<String> values = new LinkedHashSet<String>();
		driver.findElement(By.xpath("(//a[@class=\"dropdown-toggle\"])[1]")).click();
		List<WebElement> alllinks = driver.findElements(By.tagName("li"));
		System.out.println(alllinks.size());
		Thread.sleep(2000);
		for(int i=0;i<alllinks.size();i++) {
			System.out.println(alllinks.get(i).getText());
			System.out.println(values);
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Program22 a = new Program22();
		a.launch();
		System.out.println(a.Title());
		System.out.println(a.URL());
		a.display();
		
	}

}
