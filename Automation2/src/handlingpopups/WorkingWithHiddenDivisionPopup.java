package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author Aman singh
 *
 */

public class WorkingWithHiddenDivisionPopup {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/hidden?sublist=0");
		
		WebElement nameTextField = driver.findElement(By.xpath("//input[@class='w-full h-10 px-4 m-2 border-2 border-stone-600 rounded-md']"));
		
		nameTextField.sendKeys("Aman");
	}
	
	

}
