package com.TimesheetManagementToolProject.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewUserPage  extends BaseClass {

	public CreateNewUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(name="username")
	private WebElement unTextField;
	
	@FindBy(xpath ="//input[@name='passwordText']")
	private WebElement pwdTextField;
	
	@FindBy(xpath ="//input[@name='passwordTextRetype']")
	private WebElement retypepwdTextField;
	
	@FindBy(name = "firstName")
	private WebElement firstNameTextField;
	
	@FindBy(name = "lastName")
	private WebElement lastNameTextField;
	
	
	@FindBy(name = "overtimeTracking")
	private WebElement overtimeCheckbox;
	
	@FindBy(xpath ="//input[contains(@value,'Create User')]")
	private WebElement createUserButton;
	
	@FindBy(xpath ="(//input[contains(@value,'Cancel')])[2]")
	private WebElement cancelButton;

	public WebElement getUnTextField() {
		return unTextField;
	}

	public WebElement getPwdTextField() {
		return pwdTextField;
	}

	public WebElement getRetypepwdTextField() {
		return retypepwdTextField;
	}

	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}

	public WebElement getLastNameTextField() {
		return lastNameTextField;
	}

	public WebElement getOvertimeCheckbox() {
		return overtimeCheckbox;
	}

	public WebElement getCreateUserButton() {
		return createUserButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	
	//create user method
	
	public void createUser(String username,String password,String firstName,String lastName)
	{
		unTextField.sendKeys(username);
		pwdTextField.sendKeys(password);
		retypepwdTextField.sendKeys(password);
		firstNameTextField.sendKeys(firstName);
		lastNameTextField.sendKeys(lastName);
		overtimeCheckbox.click();
		createUserButton.click();	
	}
	
	
	
	

}
