package com.actitime.objectrepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCustomer {
	
	@FindBy(id="customerLightBox_nameField")
	private WebElement customerNAmeEdt;
	
	@FindBy(id="customerLightBox_descriptionField")
	private WebElement customerDescEdt;
	
    @FindBy(xpath="//div[@id='customerLightBox_commitBtn']/div/span[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
    
    @FindBy(id="customerLightBox_nameDuplicateError")
    private WebElement errorMsg;
    
    
    
	public WebElement getErrorMsg() {
		return errorMsg;
	}
	public void createCustomer(String customerNAme) {
		customerNAmeEdt.sendKeys(customerNAme);
		createCustomerBtn.click();
	}
	public void createCustomer(String customerNAme,String customerDesc) {
		customerNAmeEdt.sendKeys(customerNAme);
		customerDescEdt.sendKeys(customerDesc);
		createCustomerBtn.click();
	}

}
