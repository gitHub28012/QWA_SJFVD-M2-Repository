package com.TimesheetManagementToolProject.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CreateNewProjectPage {
	
	@FindBy(xpath ="//select[@name='customerId']")
	private WebElement customerDropdown;
	
	@FindBy(xpath ="//input[@name='name']")
	private WebElement projectNameTextfield;
	
	@FindBy(xpath ="//input[@name='createProjectSubmit']")
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
	
	public void createCustomerAndProject(String customerName,WebDriver driver,String projectName)
	{	
		CreateNewCustomerPage page = new CreateNewCustomerPage(driver);
		page.getCustomerNameTextField().sendKeys(customerName);
		page.getCreateCustomerButton().click();
		ProjectAndCustomerPage pp = new ProjectAndCustomerPage(driver);
		pp.clickOnCreateNewProject();
		Select s = new Select(customerDropdown);
		s.selectByVisibleText(customerName);
		projectNameTextfield.sendKeys(projectName);
		createProjectButton.click();	
	}
	
	

}
