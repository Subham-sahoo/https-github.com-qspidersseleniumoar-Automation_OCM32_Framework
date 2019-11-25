package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login{                        //Rule -1
	/* Element initialization*/           //Rule -2
	@FindBy(name="username")
	private WebElement userNameEdt;       
	
	@FindBy(name="pwd")
	private WebElement passwordEdt;

	@FindBy(id="loginButton")
	private WebElement loginBtn;
    
	
	
	/*element Utilization vai getters() or Business mtds */       //Rule-3 
	public WebElement getUserNameEdt() {
		return userNameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	
	
	
	
	
	
	/* business mtds*/
	public void loginToAPP(String username, String password) {
		userNameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}
	

	public void loginToAPP() {
		userNameEdt.sendKeys("admin");
		passwordEdt.sendKeys("manager");
		loginBtn.click();
	}
	
}











