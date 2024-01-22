package FileUploadPoup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadByUsingSendKeys {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demoapps.qspiders.com/fileUpload?sublist=0");
		
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		
		driver.findElement(By.id("fileInput")).sendKeys("C:\\Users\\QSP\\Desktop\\Pdf\\Placements.pdf");
		


	}

}
