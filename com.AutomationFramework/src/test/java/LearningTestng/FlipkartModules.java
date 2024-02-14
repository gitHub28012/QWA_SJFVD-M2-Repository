package LearningTestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FlipkartModules {
	
	@Test()
	public void loginIntoFlipkart()
	{
		Reporter.log("Login successfully in flipkart",true);	
	}
	
	@Test(invocationCount = 10,priority = 1)
	public void addToCart()
	{
		Reporter.log("adding the product into cart successfully",true);
	}
	
	@Test(dependsOnMethods = "loginIntoFlipkart")
	public void logout()
	{
		Reporter.log("logout test script executed successfully",true);
	}
	
	

}
