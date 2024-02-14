package DesignBaseTestUsingAnnotation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidLogin extends BaseTest {

	@Test
	public void login() throws IOException {
		Flib lib = new Flib();
		String username = lib.getDataFromProperty(PROPPATH, "Username");
		String password = lib.getDataFromProperty(PROPPATH, "Password");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
	}

}
