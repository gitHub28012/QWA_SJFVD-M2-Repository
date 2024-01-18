package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeUserDeletingTestScript {
	
	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("http://qspwakad/login.do");
		 
		 driver.findElement(By.name("username")).sendKeys("admin",Keys.TAB,"manager",Keys.TAB,Keys.TAB,Keys.ENTER);
		 
		 
		 driver.findElement(By.xpath("//a[@class='content users']")).click();
		 
		 driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		 
		 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("user@123");
		 
		 driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("user@1234");
		 
		 driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("user@1234");
		 
		 
		 driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Aman");
		 
		 driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Singh");
		 
		 driver.findElement(By.xpath("//input[contains(@value,'Create User')]")).click();
		 
		 Thread.sleep(4000);
		 driver.findElement(By.xpath("(//th[text()='User']/../..//td[@class='listtblcell'])[2]")).click();
		 
		 driver.findElement(By.xpath("//a[text()='Singh, Aman (user@123)']")).click();
		 
		 driver.findElement(By.xpath("//input[@value='Delete This User']")).click();
		 
		 
		 
		 
		
				 
	
	
	}

}
