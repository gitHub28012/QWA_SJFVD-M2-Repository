package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Validation {

	@Test
	public void validateTitle()
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qspwakad/login.do");
		if(driver.getTitle().equals("actiTIME - Login"))
//		{
//			System.out.println("title is correct");
//		}
//		else
//		{
//			System.out.println("Title is wrong");
//		}
		// use hard assert
		// Assert.assertEquals(driver.getTitle(), "actiTIME - Logi");

		// soft assert
		
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager", Keys.ENTER);

		driver.quit();
		
	}

}
