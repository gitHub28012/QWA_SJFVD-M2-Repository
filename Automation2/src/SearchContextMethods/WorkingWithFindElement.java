package SearchContextMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithFindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// to launch the browser
		WebDriver driver = new ChromeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		// to launch the web application
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//span[text()='✕']")).click();

		driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("iphone", Keys.ENTER);

		driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();

	}

}
