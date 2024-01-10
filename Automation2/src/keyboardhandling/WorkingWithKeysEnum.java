package keyboardhandling;

import java.awt.AWTException;
import java.awt.Robot;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithKeysEnum {

	public static void main(String[] args) throws AWTException  {

		// launch the browser
		WebDriver driver = new ChromeDriver();
		// maximize the browser
		driver.manage().window().maximize();
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// launch actitime application
		driver.get("http://qspwakad/login.do");
		// identify the username text field
		driver.findElement(By.name("username")).sendKeys("admin", Keys.TAB, "manager", Keys.TAB, Keys.TAB, Keys.ENTER);

	}

}
