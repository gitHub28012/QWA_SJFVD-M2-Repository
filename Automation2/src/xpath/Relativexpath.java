package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relativexpath {
	
	public static void main(String[] args) {
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to launch the web application
		driver.get("https://demowebshop.tricentis.com/");
		
		//identify register link with absolute xpath and click on register link
		driver.findElement(By.xpath("(//ul/li[2]/a[1])[1]")).click();
	}

}
