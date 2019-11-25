package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActtiveProjectAndCustomer {
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement crearteCustomerBtn;
	
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement crearteProjectBtn;


	public WebElement getCrearteCustomerBtn() {
		return crearteCustomerBtn;
	}

	public WebElement getCrearteProjectBtn() {
		return crearteProjectBtn;
	}

}
