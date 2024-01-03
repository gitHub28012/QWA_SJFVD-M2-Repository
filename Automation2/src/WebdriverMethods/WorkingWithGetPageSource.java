package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetPageSource {
	
	public static void main(String[] args) {
		
		//to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the window
		driver.manage().window().maximize();
		
		//to launch the web application
		driver.get("https://www.amazon.com/");
		
		//to fetch the source code
		String sc = driver.getPageSource();
		
		System.out.println(sc);
	}

}
