package com.acttime.customerTest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.FileLib;
import com.actitime.objectrepositorylib.ActtiveProjectAndCustomer;
import com.actitime.objectrepositorylib.CreateNewCustomer;
import com.actitime.objectrepositorylib.Home;
import com.actitime.objectrepositorylib.OpenTask;
/**
 * 
 * @author anand
 *
 */
@Listeners(com.actitime.genericlib.ListImplementation.class)
public class CustomerTest extends BaseClass{
	FileLib fLib = new FileLib();

	@Test
	public void createCustomer() throws Throwable, Throwable{
		/* read test script data from xls*/
		String customerNAme = fLib.getExcelData("Sheet1", 1, 2);
		
		/*step 2 : navigate to Task PAge*/
         Home hp = PageFactory.initElements(driver, Home.class);
         hp.getTaskImg().click();
         
         /*step 3 : navigate to Open TAsk PAge*/
         OpenTask op = PageFactory.initElements(driver, OpenTask.class);
         op.getProjAndCustLnk().click();
         
         /*step 4 : navigate to create new Customer PAge*/
         ActtiveProjectAndCustomer apc = PageFactory.initElements(driver, ActtiveProjectAndCustomer.class);
         apc.getCrearteCustomerBtn().click();
         
         /*step 5 : create a customer*/
         CreateNewCustomer cnc = PageFactory.initElements(driver, CreateNewCustomer.class);
         cnc.createCustomer(customerNAme);
	}
	
	@Test
	public void createCustomerWithDEscription() throws Throwable, Throwable{
		/* read test script data from xls*/
		String customerNAme = fLib.getExcelData("Sheet1", 4, 2);
		String customerDesc = fLib.getExcelData("Sheet1", 4, 3);
		
		/*step 2 : navigate to Task PAge*/
         Home hp = PageFactory.initElements(driver, Home.class);
         hp.getTaskImg().click();
         
         /*step 3 : navigate to Open TAsk PAge*/
         OpenTask op = PageFactory.initElements(driver, OpenTask.class);
         op.getProjAndCustLnk().click();
         
         /*step 4 : navigate to create new Customer PAge*/
         ActtiveProjectAndCustomer apc = PageFactory.initElements(driver, ActtiveProjectAndCustomer.class);
         apc.getCrearteCustomerBtn().click();
         
         /*step 5 : create a customer*/
         CreateNewCustomer cnc = PageFactory.initElements(driver, CreateNewCustomer.class);
         cnc.createCustomer(customerNAme, customerDesc);
	}




}






