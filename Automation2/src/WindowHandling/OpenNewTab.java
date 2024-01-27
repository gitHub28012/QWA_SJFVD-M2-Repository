package WindowHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenNewTab {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		//to launch a new tab
		//driver.switchTo().newWindow(WindowType.TAB);
		
		//to launch an new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		
	}

}
