package WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindow {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone 14 (Midnight, 128 GB)']")).click();
		
		//it will give the parent as well as child window id
		Set<String> all_id = driver.getWindowHandles();
		
		for(String id:all_id)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals("APPLE iPhone 14 ( 128 GB Storage ) Online at Best Price On Flipkart.com"))
			{
				break;
			}
		}
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		

		
		
		

}
	
}
