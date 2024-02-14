package com.TimesheetManagementToolProject.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTasksPage extends BaseClass{

	public OpenTasksPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//a[text()='Projects & Customers']")
	private WebElement projectAndCustomerButton;

	public WebElement getProjectAndCustomerButton() {
		return projectAndCustomerButton;
	}
	
	public void clickOnProjectAndCustomer()
	{
		projectAndCustomerButton.click();
	}
	
	
	

}
