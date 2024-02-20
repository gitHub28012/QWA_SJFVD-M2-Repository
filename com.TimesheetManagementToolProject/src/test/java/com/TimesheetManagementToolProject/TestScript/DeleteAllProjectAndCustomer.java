package com.TimesheetManagementToolProject.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.TimesheetManagementToolProject.GenericLib.BaseTest;
import com.TimesheetManagementToolProject.PomPages.HomePage;
import com.TimesheetManagementToolProject.PomPages.LoginPage;
import com.TimesheetManagementToolProject.PomPages.OpenTasksPage;
import com.TimesheetManagementToolProject.PomPages.ProjectAndCustomerPage;

public class DeleteAllProjectAndCustomer extends BaseTest {

	@Test(groups = "IT")
	public void deleteAllProjectAndCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		String username = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoActitime(username, password);

		// click on task
		HomePage hp = new HomePage(driver);
		hp.clickOnTasksLink();

		// click on project and customer
		OpenTasksPage otp = new OpenTasksPage(driver);
		otp.clickOnProjectAndCustomer();

		// delete all
		ProjectAndCustomerPage pacp = new ProjectAndCustomerPage(driver);
		pacp.clickOnAllDelete();

	}

}
