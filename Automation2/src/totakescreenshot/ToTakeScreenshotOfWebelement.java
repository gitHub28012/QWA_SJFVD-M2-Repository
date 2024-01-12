package totakescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class ToTakeScreenshotOfWebelement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		// click on not now
		driver.findElement(By.id("denyBtn")).click();
		WebElement coin = driver.findElement(By.xpath("//a[@title='Coins']"));
		Actions act = new Actions(driver);
		act.moveToElement(coin).perform();
		driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
		// identify the particular webelement
		WebElement gold = driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']"));
		// call getScreenshotAs methods
		File src = gold.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/gold.png");
		Files.copy(src, dest);

	}

}
