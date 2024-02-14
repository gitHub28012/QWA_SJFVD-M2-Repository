package DesignBaseTestUsingAnnotation;

import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class CreateUser extends BaseTest {

	@Test
	public void createUser() throws IOException, InterruptedException {
		Random r = new Random();
		int no = r.nextInt(10);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("ABSCD43" + no);
		driver.findElement(By.name("passwordText")).sendKeys("Abcdef12");
		driver.findElement(By.name("passwordTextRetype")).sendKeys("Abcdef12");
		driver.findElement(By.name("firstName")).sendKeys("Testengg" + no);
		driver.findElement(By.name("lastName")).sendKeys("Abcdef12" + no);

		driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();

	}

}
