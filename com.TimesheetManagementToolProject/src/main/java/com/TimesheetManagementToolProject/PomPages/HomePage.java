package com.TimesheetManagementToolProject.PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BaseClass{

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//users link in home page
	@FindBy(xpath ="//a[@class='content users']")
	private WebElement usersLink;
	
	@FindBy(xpath ="//a[@class='content tasks']")
	private WebElement tasksLink;
	
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logoutLink;

	public WebElement getUsersLink() {
		return usersLink;
	}

	public WebElement getTasksLink() {
		return tasksLink;
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}
	
	//click on users link
	public void clickOnUserLink()
	{
		usersLink.click();
	}
	
	//click on tasks link
	public void clickOnTasksLink() throws InterruptedException
	{
		Thread.sleep(2000);
		tasksLink.click();
	}
	
	//click on logout link
	public void clickOnlogoutLink()
	{
		logoutLink.click();
	}

}
