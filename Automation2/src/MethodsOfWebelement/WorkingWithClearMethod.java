package MethodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClearMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

//		username.sendKeys("admin");
//		Thread.sleep(2000);
//
//		// use clear method
//		username.clear();
//		Thread.sleep(2000);
//		
//		username.sendKeys("admin123");

		driver.get("http://qspwakad/login.do");

		WebElement username = driver.findElement(By.name("username"));

		Dimension size = username.getSize();

		System.out.println(size);
		
	

	}

}
