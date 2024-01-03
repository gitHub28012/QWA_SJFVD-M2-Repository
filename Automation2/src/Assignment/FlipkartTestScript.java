package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTestScript {

	public static void main(String[] args) {

		// to launch the browser
		WebDriver driver = new ChromeDriver();

		// to maximize the browser
		driver.manage().window().maximize();

		// to launch the web application
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//span[text()='✕']")).click();

		driver.findElement(By.xpath("//input[contains(@class,'Pke')]")).sendKeys("iphone", Keys.ENTER);

		List<WebElement> productName = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
		
		 List<WebElement> productPrice = driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));

		
		 for(int i=0;i<productName.size();i++)
		 {
			 String name=productName.get(i).getText();
			 for(int j=i;j<=i;j++)
			 {
				 String price=productPrice.get(j).getText();
				 
				 System.out.println(name+" : "+price);
			 }
		 }
		 
		 
		 
		 
		 
		 
		 
	}

}
