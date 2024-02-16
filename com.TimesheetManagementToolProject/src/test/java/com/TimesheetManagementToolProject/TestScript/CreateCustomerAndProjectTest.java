package com.TimesheetManagementToolProject.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.TimesheetManagementToolProject.GenericLib.BaseTest;
import com.TimesheetManagementToolProject.GenericLib.Flib;
import com.TimesheetManagementToolProject.GenericLib.WorkLib;
import com.TimesheetManagementToolProject.PomPages.CreateNewProjectPage;
import com.TimesheetManagementToolProject.PomPages.HomePage;
import com.TimesheetManagementToolProject.PomPages.OpenTasksPage;
import com.TimesheetManagementToolProject.PomPages.ProjectAndCustomerPage;

public class CreateCustomerAndProjectTest extends BaseTest {

	@Test
	public void createCustomerAndProject() throws EncryptedDocumentException, IOException, InterruptedException
	{
		//login
		ValidLoginTest vlt = new ValidLoginTest();
		vlt.login();
		//click on task
		HomePage hp = new HomePage(driver);
		hp.clickOnTasksLink();
		
		//click on project and customer
		OpenTasksPage otp = new OpenTasksPage(driver);
		otp.clickOnProjectAndCustomer();
		
		//click on create new customer
		ProjectAndCustomerPage pacp = new ProjectAndCustomerPage(driver);
		pacp.clickOnCreateNewCustomer();
		
		//fetching the data
		Flib lib = new Flib();
		WorkLib wlib = new WorkLib();
		String customerName = lib.getDataFromExcelFile(EXCELPATH, CUSTOMERSHEET, 1, 0)+wlib.randomNo();
		String projectName = lib.getDataFromExcelFile(EXCELPATH, CUSTOMERSHEET, 1, 1)+wlib.randomNo();
		
		//create customer and project
		CreateNewProjectPage cnpp = new CreateNewProjectPage(driver);
		cnpp.createCustomerAndProject(customerName,projectName);
		

}
}
