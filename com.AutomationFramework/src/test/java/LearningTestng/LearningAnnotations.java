package LearningTestng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearningAnnotations {
	@AfterSuite
	public void afterSuite() {
		Reporter.log("close the server connection", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("Connecting to the database", true);
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("Launch the browser", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("Login into the application", true);
	}

	@Test
	public void testScript() {
		Reporter.log("Test script executed", true);
	}
	
	
	@Test
	public void testScript2()
	{
		Reporter.log("Test script 2 executed successfully",true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("logout from the application", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("close the browser", true);
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("close the db connection", true);
	}

	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Connecting to the server", true);
	}

}
