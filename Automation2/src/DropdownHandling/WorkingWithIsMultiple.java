package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithIsMultiple {

	public static void main(String[] args) {

		// Launch the browser
		WebDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		// launch the webapplication
		driver.get("https://demoapps.qspiders.com/dropdown?sublist=0");

		// identify single-select dropdown
		 WebElement dropdown = driver.findElement(By.id("select3"));

		// create the object of select class
		Select s = new Select(dropdown);

		// use is multiple method
		boolean value = s.isMultiple();
		System.out.println(value);

	}

}
