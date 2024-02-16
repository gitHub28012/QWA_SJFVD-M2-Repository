package com.TimesheetManagementToolProject.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import com.TimesheetManagementToolProject.GenericLib.BaseTest;

public class CreateNewProjectPage extends BaseClass {

	public CreateNewProjectPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//select[@name='customerId']")
	private WebElement customerDropdown;

	@FindBy(xpath = "//input[@name='name']")
	private WebElement projectNameTextfield;

	@FindBy(xpath = "//input[@name='createProjectSubmit']")
	private WebElement createProjectButton;

	public WebElement getCustomerDropdown() {
		return customerDropdown;
	}

	public WebElement getProjectNameTextfield() {
		return projectNameTextfield;
	}

	public WebElement getCreateProjectButton() {
		return createProjectButton;
	}

	public void createCustomerAndProject(String customerName, String projectName) throws InterruptedException {
		CreateNewCustomerPage page = new CreateNewCustomerPage(BaseTest.sdriver);
		page.getCustomerNameTextField().sendKeys(customerName);
		page.getCreateCustomerButton().click();
		ProjectAndCustomerPage pp = new ProjectAndCustomerPage(BaseTest.sdriver);
		pp.clickOnCreateNewProject();
		Select s = new Select(customerDropdown);
		customerDropdown.click();
		s.selectByVisibleText(customerName);
		projectNameTextfield.sendKeys(projectName);
		createProjectButton.click();
	}

}
