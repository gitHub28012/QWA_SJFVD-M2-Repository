package WebdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithGetMethod {

	public static void main(String[] args) {

		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to open the web application
		driver.get("https://www.flipkart.com/");
	}

}
