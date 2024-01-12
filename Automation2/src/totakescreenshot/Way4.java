package totakescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way4 {

	public static void main(String[] args) throws IOException {

		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.netflix.com/in/");
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/netflix.png");
		Files.copy(src, dest);
		
		
		
		

	}

}
