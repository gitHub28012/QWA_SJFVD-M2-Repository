package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMap {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.co.in/");
		
		//click on google apps
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		
		//switch to frame by using index
		//driver.switchTo().frame(1);
		
		//switch to frame by using name attribute value
		driver.switchTo().frame("app");
		
		//click on google maps
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
