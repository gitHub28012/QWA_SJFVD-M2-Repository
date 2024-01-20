package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YatraTestScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		driver.findElement(By.id("booking_engine_hotels")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='BE_hotel_destination']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='viewport']/descendant::li[5]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BE_hotel_checkin_date")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("22/01/2024")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("25/01/2024")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("BE_Hotel_pax_info")).click();
		Thread.sleep(2000);
		for(int i=0;i<=2;i++)
		{
		driver.findElement(By.xpath("//span[@class='ddSpinnerPlus']")).click();
		Thread.sleep(2000);
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search Hotels']")).click();
		

	}

}
