package WebdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		Dimension d = new Dimension(100, 200);
		
		driver.manage().window().setSize(d);
	}

}
