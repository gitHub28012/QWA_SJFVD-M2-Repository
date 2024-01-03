package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNavigateMethod {
	
	public static void main(String[] args) throws InterruptedException  {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize
		driver.manage().window().maximize();
		
		driver.get("https://www.zomato.com/india");
		
		//to navigate the application
		driver.navigate().to("https://www.swiggy.com/");
		
		//to go back
		Thread.sleep(2000);
		driver.navigate().back();
		
		//to go forward
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//to refresh
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		driver.quit();
		
		
	}

}
