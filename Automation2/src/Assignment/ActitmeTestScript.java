package Assignment;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActitmeTestScript {
	
	public static void main(String[] args) throws InterruptedException {
		
		Random r = new Random();
		
		int no = r.nextInt(10000);
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//to launch the webapplication
		driver.get("http://qspwakad/login.do");
		
		//identify username and pass the value
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		
		//identify the password and pass the value
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		//identify the login button
		driver.findElement(By.id("loginButton")).click();
		
		//Thread.sleep(3000);
		
		//click on task
		driver.findElement(By.xpath("//a[@class='content tasks']")).click();
		
		//click on project& customer
		driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();
		
		//click on create new customer
		driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
		
		//pass the customer name
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sai prasad"+no);
		
		//click on create customer
		driver.findElement(By.name("createCustomerSubmit")).click();
		
		//close the browser
		driver.quit();
		
		//Select s = new Select(WebElement);
		
		
	}

}
