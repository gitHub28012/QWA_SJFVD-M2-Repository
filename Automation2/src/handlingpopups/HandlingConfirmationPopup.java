package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/alert?sublist=0");
		driver.findElement(By.xpath("//a[text()='Confirm']")).click();
		driver.findElement(By.id("buttonAlert5")).click();
		//handling confirmation popup
		Alert alt = driver.switchTo().alert();
		//click on ok
		//alt.accept();
		//click on cancel
		alt.dismiss();
		
		

	}

}
