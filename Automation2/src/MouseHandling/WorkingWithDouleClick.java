package MouseHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingWithDouleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demoapps.qspiders.com/button/buttonDoubleClick?sublist=2");
		//create the object of actions class
		Actions act = new Actions(driver);
		//use double click method
		act.doubleClick(driver.findElement(By.id("btn20"))).perform();
		Thread.sleep(3000);
		//close the browser
		driver.quit();
		
		
		

	}

}
