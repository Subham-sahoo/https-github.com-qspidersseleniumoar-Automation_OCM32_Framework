package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement taskImg;
	
	@FindBy(xpath="//div[text()='USERS']")
	private WebElement userImg;
	
	@FindBy(xpath="//a[@id='logoutLink']")
	private WebElement logoutLnk;

	public WebElement getLogoutLnk() {
		return logoutLnk;
	}
	public WebElement getTaskImg() {
		return taskImg;
	}
	public WebElement getUserImg() {
		return userImg;
	}
	public void logout() {
		logoutLnk.click();
	}
}
