package com.TimesheetManagementToolProject.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.TimesheetManagementToolProject.GenericLib.BaseTest;
import com.TimesheetManagementToolProject.GenericLib.Flib;
import com.TimesheetManagementToolProject.GenericLib.WorkLib;
import com.TimesheetManagementToolProject.PomPages.CreateNewUserPage;
import com.TimesheetManagementToolProject.PomPages.CreateUserPage;
import com.TimesheetManagementToolProject.PomPages.HomePage;
import com.TimesheetManagementToolProject.PomPages.LoginPage;

public class CreateUserTest extends BaseTest {

	@Test(groups = "ST")
	public void createUser() throws EncryptedDocumentException, IOException {

		String username = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoActitime(username, password);
		HomePage hp = new HomePage(driver);
		hp.clickOnUserLink();
		CreateUserPage cup = new CreateUserPage(driver);
		cup.clickOnCreateNewUser();
		CreateNewUserPage cnw = new CreateNewUserPage(driver);
		WorkLib wlib = new WorkLib();
		String username1 = lib.getDataFromExcelFile(EXCELPATH, USERSHEETNAME, 1, 0);
		String password1 = lib.getDataFromExcelFile(EXCELPATH, USERSHEETNAME, 1, 1);
		String fn = lib.getDataFromExcelFile(EXCELPATH, USERSHEETNAME, 1, 2);
		String ln = lib.getDataFromExcelFile(EXCELPATH, USERSHEETNAME, 1, 3);
		cnw.createUser(username1 + wlib.randomNo(), password1 + wlib.randomNo(), fn + wlib.randomNo(),
				ln + wlib.randomNo());

	}

}
