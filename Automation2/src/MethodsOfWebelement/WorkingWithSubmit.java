package MethodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSubmit {

	public static void main(String[] args) throws InterruptedException {

		// to launch the browser
		WebDriver driver = new ChromeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		// to launch the web application
		driver.get("https://www.flipkart.com/");

		//driver.findElement(By.xpath("//span[text()='✕']")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		Thread.sleep(2000);
		
		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		submitButton.submit();
	}

}
