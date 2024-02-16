package com.TimesheetManagementToolProject.GenericLib;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest extends Flib implements IAutoConstant {

	public WebDriver driver;
	public static WebDriver sdriver;

	@BeforeClass
	public void launchBrowser() throws IOException {
		Flib lib = new Flib();
		String browser = lib.getDataFromPropertyFile(PROPPATH, BROWSERKEY);
		String url = lib.getDataFromPropertyFile(PROPPATH, URLKEY);
		Reporter.log("==Launching "+browser+" Browser==",true);
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equals("edge"))
		{
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		else {
			Reporter.log("Invalid Browser",true);
		}
		sdriver=driver;
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get(url);

	}
	
	@AfterClass
	public void closeBrowser()
	{
		driver.quit();
	}

}
