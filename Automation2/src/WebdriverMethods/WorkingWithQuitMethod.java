package WebdriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithQuitMethod {
	
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver  = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to open the web application
		driver.get("https://omayo.blogspot.com/");
		
		//to click on new popup window
		driver.findElement(By.xpath("//a[text()='Open a popup window']")).click();
		
		//driver.close();
		
		driver.quit();
		
	}

}
