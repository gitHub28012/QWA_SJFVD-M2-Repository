package FileUploadPoup;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadResumeInNaukri {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.naukri.com/");
		
		//click on register button
		driver.findElement(By.id("register_Layer")).click();
		
		
		//click on upload resume
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		
		//integrate auto it with ecllipse
		
		Runtime.getRuntime().exec("./AutoIT/naukrifileupload.exe");

	}

}
