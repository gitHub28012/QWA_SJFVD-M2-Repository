package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDeselectByVisibleText {

	public static void main(String[] args) throws InterruptedException {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// launch the webapplication
		driver.get("https://demoapps.qspiders.com/dropdown/multiSelect?sublist=1");

		// identify multi-select dropdown
		WebElement dropdown = driver.findElement(By.id("select-multiple-native"));

		// create the object of select class
		Select s = new Select(dropdown);
		s.selectByVisibleText("India");
		s.selectByVisibleText("Canada");
		s.selectByVisibleText("United Kingdom");
		Thread.sleep(3000);
		// deselectAll
		s.deselectAll();

//		s.deselectByVisibleText("India");
//
//		s.deselectByVisibleText("Canada");
//
//		s.deselectByVisibleText("United Kingdom");

	}

}
