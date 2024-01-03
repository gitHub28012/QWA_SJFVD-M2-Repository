package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateInstaLoginPage {

	public static void main(String[] args) throws InterruptedException {

		// to launch the browser
		WebDriver driver = new ChromeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		// to open the application
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(2000);
		
		//to identify the username text field
		driver.findElement(By.name("username")).sendKeys("amansingh@gmail.com");
		
		//to identify the password text field
		driver.findElement(By.name("password")).sendKeys("Aman@123");
		
		driver.findElement(By.className(" _acan _acap _acas _aj1- _ap30")).click();
	}

}
