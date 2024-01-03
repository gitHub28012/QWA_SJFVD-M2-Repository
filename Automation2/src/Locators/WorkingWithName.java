package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithName {

	public static void main(String[] args) {

		// to launch the browser
		WebDriver driver = new ChromeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		// to launch the web application
		driver.get("http://qspwakad/login.do");
		
		//identify username
		driver.findElement(By.name("username")).sendKeys("admin");
		
		//identify password text field
		driver.findElement(By.name("pwd")).sendKeys("manager");
		
		//idenify the login button
		driver.findElement(By.id("loginButton")).click();
		
		
	}

}
