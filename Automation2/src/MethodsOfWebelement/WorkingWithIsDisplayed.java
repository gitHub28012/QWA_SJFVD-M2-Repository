package MethodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsDisplayed {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://qspwakad/login.do");

		WebElement loginButton = driver.findElement(By.id("loginButton"));
		
		if(loginButton.isDisplayed())
		{
			System.out.println("Login button is displayed");
		}
		else
		{
			System.out.println("Login button is not displayed");
		}
	}

}
