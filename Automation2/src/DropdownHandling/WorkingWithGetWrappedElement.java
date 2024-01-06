package DropdownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithGetWrappedElement {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("file:///C:/Users/QSP/Desktop/Movies.html");

		WebElement dropdown = driver.findElement(By.id("Dropdown"));

		Select s = new Select(dropdown);
		
		WebElement alloptions = s.getWrappedElement();
		
		System.out.println(alloptions.getText());

	}

}
