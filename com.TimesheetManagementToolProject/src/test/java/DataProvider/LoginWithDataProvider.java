package DataProvider;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithDataProvider {
	
	
	@DataProvider(name="TestData")
	public Object[][] loginTestData() throws EncryptedDocumentException, IOException
	{
		return ReadExcel.getMultipleDataFromExcelSheet("Invalid");
	}
	
	@Test(dataProvider = "TestData")
	public void login(String username, String password)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://qspwakad/login.do");
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password,Keys.ENTER);
		driver.quit();
	}

}
