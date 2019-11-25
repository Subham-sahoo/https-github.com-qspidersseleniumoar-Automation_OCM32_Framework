package com.acttime.customerTest;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.FileLib;
import com.actitime.objectrepositorylib.ActtiveProjectAndCustomer;
import com.actitime.objectrepositorylib.CreateNewCustomer;
import com.actitime.objectrepositorylib.Home;
import com.actitime.objectrepositorylib.OpenTask;
/**
 * 
 * @author Gurav
 *
 */
public class CustomerSearchCreate extends BaseClass{
	FileLib fLib = new FileLib();
	@Test
	public void createDuplicateCustomer() throws Throwable{
		/*read data from EXcel*/
		String customerNAme = fLib.getExcelData("Sheet1", 7, 2);
		String expErrorMSg = fLib.getExcelData("Sheet1", 7, 3);
		/*navigate to task PAge*/
		Home hp = PageFactory.initElements(driver, Home.class);
		hp.getTaskImg().click();
		/*navigate to Project * Customer PAge*/
		OpenTask op = PageFactory.initElements(driver, OpenTask.class);
		op.getProjAndCustLnk().click();
		/*navigate to create New Customer Page*/
		ActtiveProjectAndCustomer apc = PageFactory.initElements(driver, ActtiveProjectAndCustomer.class);
		apc.getCrearteCustomerBtn().click();
		/*navigate to create New Customer twice with same Page*/
		CreateNewCustomer cnc = PageFactory.initElements(driver, CreateNewCustomer.class);
		cnc.createCustomer(customerNAme);
		//create same customer again
		apc.getCrearteCustomerBtn().click();
		cnc.createCustomer(customerNAme);
		//verify
		String actEroorMsg = cnc.getErrorMsg().getText();
		Assert.assertEquals(expErrorMSg, actEroorMsg);
		
	}

}



