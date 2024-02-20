package com.TimesheetManagementToolProject.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.TimesheetManagementToolProject.GenericLib.BaseTest;
import com.TimesheetManagementToolProject.GenericLib.CustomListener;
import com.TimesheetManagementToolProject.GenericLib.Flib;
import com.TimesheetManagementToolProject.PomPages.LoginPage;


@Listeners(CustomListener.class)
public class ValidLoginTest extends BaseTest {

	@Test(groups = "ST")
	public void login() throws EncryptedDocumentException, IOException {
		Flib lib = new Flib();
		String username = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 1);
		LoginPage lp = new LoginPage(driver);
		lp.loginIntoActitime(username, password);
	}

}
