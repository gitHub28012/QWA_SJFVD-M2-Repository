package MethodsOfWebelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsSelected {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://qspwakad/login.do");

		WebElement checkbox = driver.findElement(By.xpath("//input[@name='remember']"));
		
		checkbox.click();
		
		if(checkbox.isSelected())
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("checkbox is not selected");
		}
	}

}
