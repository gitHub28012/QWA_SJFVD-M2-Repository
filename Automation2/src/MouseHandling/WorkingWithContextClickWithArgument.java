package MouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithContextClickWithArgument {
	
	public static void main(String[] args) {
		

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/button/buttonRightClick?sublist=1");
		
		//create the object of actions class
		Actions act = new Actions(driver);
		
		//use context click method
		act.contextClick(driver.findElement(By.id("btn30"))).perform();
	}

}
