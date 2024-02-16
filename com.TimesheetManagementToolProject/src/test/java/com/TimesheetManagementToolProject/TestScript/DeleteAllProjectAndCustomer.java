package com.TimesheetManagementToolProject.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.TimesheetManagementToolProject.GenericLib.BaseTest;
import com.TimesheetManagementToolProject.PomPages.HomePage;
import com.TimesheetManagementToolProject.PomPages.OpenTasksPage;
import com.TimesheetManagementToolProject.PomPages.ProjectAndCustomerPage;

public class DeleteAllProjectAndCustomer  extends BaseTest{

	@Test
	public void deleteAllProjectAndCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		ValidLoginTest vlt = new ValidLoginTest();
		vlt.login();

		// click on task
		HomePage hp = new HomePage(driver);
		hp.clickOnTasksLink();

		// click on project and customer
		OpenTasksPage otp = new OpenTasksPage(driver);
		otp.clickOnProjectAndCustomer();
		
		//delete all
		ProjectAndCustomerPage pacp = new ProjectAndCustomerPage(driver);
		pacp.clickOnAllDelete();

	}

}
