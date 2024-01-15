package javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillParticularWebElement {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.zomato.com/india");
		
		WebElement scrollTill = driver.findElement(By.xpath("//p[text()='Work With Us']"));
		
		Rectangle rec = scrollTill.getRect();
		
		int x = rec.getX();
		 
		int y = rec.getY();
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		js.executeScript("window.scrollBy("+x+","+y+")");
		
		
		
		
	}

}
