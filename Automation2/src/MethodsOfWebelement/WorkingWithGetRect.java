package MethodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetRect {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://qspwakad/login.do");

		WebElement username = driver.findElement(By.name("username"));
		
		Rectangle rect = username.getRect();
		
		int height = rect.getHeight();
		
		int width = rect.getWidth();
		
		int x = rect.getX();
		
		int y = rect.getY();
		
		System.out.println(height);
		
		System.out.println(width);
		
		System.out.println(x);
		
		System.out.println(y);
		
		
	}

}
