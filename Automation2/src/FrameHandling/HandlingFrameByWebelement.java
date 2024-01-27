package FrameHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameByWebelement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.dream11.com/");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']"));

		// switch to frame by using index
		driver.switchTo().frame(frame1);
		
		// enter the mobile no into mobile no text field
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("123456789");
	}

}
