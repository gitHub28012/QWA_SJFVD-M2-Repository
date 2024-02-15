package com.TimesheetManagementToolProject.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProjectAndCustomerPage extends BaseClass {

	public ProjectAndCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath ="//input[@value='Create New Customer']")
	private WebElement createNewCustomerButton;
	
	@FindBy(xpath ="//input[@value='Create New Project']")
	private WebElement createNewProjectButton;
	
	@FindBy(xpath ="//a[text()='All']")
	private WebElement allDeleteLink;
	
	@FindBy(xpath = "//input[@value='Delete Selected']")
	private WebElement deleteSelectedButton;
	
	@FindBy(xpath = "//input[@value='Delete This Customer']")
	private WebElement deleteCustomerButton;

	public WebElement getDeleteSelectedButton() {
		return deleteSelectedButton;
	}

	public WebElement getDeleteCustomerButton() {
		return deleteCustomerButton;
	}

	public WebElement getAllDeleteLink() {
		return allDeleteLink;
	}

	public WebElement getCreateNewCustomerButton() {
		return createNewCustomerButton;
	}

	public WebElement getCreateNewProjectButton() {
		return createNewProjectButton;
	}
	
	//click on create new customer
	
	public void clickOnCreateNewCustomer()
	{
		createNewCustomerButton.click();
	}
	
	public void clickOnCreateNewProject()
	{
		createNewProjectButton.click();
	}
	
	public void clickOnAllDelete()
	{
		allDeleteLink.click();
		deleteSelectedButton.click();
		deleteCustomerButton.click();
	}
	

}
