package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptpopup {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demoapps.qspiders.com/alert?sublist=0");
	driver.findElement(By.xpath("//a[text()='Prompt']")).click();
	driver.findElement(By.id("buttonAlert1")).click();
	//handling prompt popup
	Alert alt = driver.switchTo().alert();
	Thread.sleep(2000);
	//pass the value inside the text field inside alert poup
	alt.sendKeys("yes");
	Thread.sleep(4000);
	//to get the text
	System.out.println(alt.getText());
	//click on ok
	alt.accept();

	
	}
}
