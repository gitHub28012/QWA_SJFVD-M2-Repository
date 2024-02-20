package com.TimesheetManagementToolProject.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.TimesheetManagementToolProject.GenericLib.BaseTest;
import com.TimesheetManagementToolProject.GenericLib.Flib;
import com.TimesheetManagementToolProject.PomPages.LoginPage;

public class InvalidLoginTest extends BaseTest {

	@Test(groups = "FT")
	public void invalidLogin() throws EncryptedDocumentException, IOException {
		Flib lib = new Flib();
		int rc = lib.getRowCount(EXCELPATH, INVALIDSHEETNAME);
		for (int i = 1; i <= rc; i++) {
			String username = lib.getDataFromExcelFile(EXCELPATH, INVALIDSHEETNAME, i, 0);
			String password = lib.getDataFromExcelFile(EXCELPATH, INVALIDSHEETNAME, i, 1);
			LoginPage lp = new LoginPage(driver);
			lp.invalidLoginIntoActitime(username, password);

		}
	}

}
