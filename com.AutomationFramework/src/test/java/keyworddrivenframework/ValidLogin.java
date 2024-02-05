package keyworddrivenframework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLogin extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {

		// launch the browser
		BaseTest test = new BaseTest();
		test.setup();

		Flib lib = new Flib();
		String username = lib.getDataFromProperty(PROPPATH, "Username");
		String password = lib.getDataFromProperty(PROPPATH, "Password");

		test.driver.findElement(By.name("username")).sendKeys(username);
		test.driver.findElement(By.name("pwd")).sendKeys(password);
		test.driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(2000);
		test.tearDown();
		
		

	}

}
