package LearningTestng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FaceBook {
	
	
	@Test()
	public void Register()
	{
		Reporter.log("Registered successfully",true);
	}
	
	@Test(dependsOnMethods =  "Register")
	public void Login()
	{
		Reporter.log("Login successfully",true);
	}

}
