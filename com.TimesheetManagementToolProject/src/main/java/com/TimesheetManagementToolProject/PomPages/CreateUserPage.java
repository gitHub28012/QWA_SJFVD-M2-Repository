package com.TimesheetManagementToolProject.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateUserPage  extends BaseClass{

	public CreateUserPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	@FindBy(xpath ="//input[@value='Create New User']")
	private WebElement createNewUserButton;


	public WebElement getCreateNewUserButton() {
		return createNewUserButton;
	}
	
	//click on createnewuser button
	public void clickOnCreateNewUser()
	{
		createNewUserButton.click();
	}
	

}
