package totakescreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Way1 {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.apple.com/in/iphone/");
		// explicit typeCasting
		TakesScreenshot ts = (TakesScreenshot) driver;
		// to use getScreenshotAs Method
		File src = ts.getScreenshotAs(OutputType.FILE);
		// create a new file and pass the path where you want to store you screenshot
		File dest = new File("./screenshot/iphone.png");
		// copy from src to dest
		Files.copy(src, dest);

	}

}
