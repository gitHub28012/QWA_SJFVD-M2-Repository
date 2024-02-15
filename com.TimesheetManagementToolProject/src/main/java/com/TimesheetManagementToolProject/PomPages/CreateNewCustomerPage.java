package com.TimesheetManagementToolProject.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomerPage extends BaseClass{

	public CreateNewCustomerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath ="//input[@name='name']")
	private WebElement customerNameTextField;
	
	@FindBy(xpath ="//input[@name='createCustomerSubmit']")
	private WebElement createCustomerButton;

	public WebElement getCustomerNameTextField() {
		return customerNameTextField;
	}

	public WebElement getCreateCustomerButton() {
		return createCustomerButton;
	}
	
	
	
	

}
