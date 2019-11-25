package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.actitime.objectrepositorylib.Home;
import com.actitime.objectrepositorylib.Login;

public class BaseClass extends Browser{
	@BeforeSuite
	public void configBS() {
		System.out.println("connect to DB");
	}
	@AfterSuite
	public void configAS() {
		System.out.println("dissconnect to DB");
	}
	@BeforeClass
	public void configBC() throws Throwable {
		System.out.println("========LAUNCH BRowser========");
		launchBrowser();
	}
	@BeforeMethod
	public void configBM() throws Throwable {
	  FileLib fLib = new FileLib();
	  Login loginPage = PageFactory.initElements(driver, Login.class);
	  String URL = fLib.getPropertyFileData("url");
	  String USERNAME = fLib.getPropertyFileData("username");
	  String PASSWORD = fLib.getPropertyFileData("password");
	  
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get(URL);
      Thread.sleep(1000);
	  loginPage.loginToAPP(USERNAME, PASSWORD);
	}
	
	@AfterMethod
	public void configAM() throws Throwable {
		System.out.println("logout");
		Thread.sleep(1000);
		Home homePage = PageFactory.initElements(driver, Home.class);
		homePage.logout();
	}
	@AfterClass
	public void configAC() {
		System.out.println("=======Close Browser=======");
		closeBrowser();
	}
}









