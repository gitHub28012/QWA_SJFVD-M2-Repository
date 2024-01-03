package WebdriverMethods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().setPosition(new Point(400, 200));
	}

}
