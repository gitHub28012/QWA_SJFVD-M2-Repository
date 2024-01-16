package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopperstackTestScript {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://shoppersstack.com/");

		Thread.sleep(2000);
		driver.findElement(By.id("loginBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("mahibhai@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("Password@123");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("men"))));
		
		
		WebElement men = driver.findElement(By.id("men"));

		Actions act = new Actions(driver);

		act.moveToElement(men).perform();

		driver.findElement(By.xpath("//a[text()='T-shirts']")).click();
		Thread.sleep(2000);

	}

}
