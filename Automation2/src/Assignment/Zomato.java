package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	
	public static void main(String[] args) {
		
		// to launch the browser
		WebDriver driver = new ChromeDriver();
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		//to open the application
		driver.get("https://www.zomato.com/india");
		
		// to fetch the title
		String title = driver.getTitle();
		
		System.out.println(title);
		
		//to fetch the url
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
			}

}
