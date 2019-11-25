package com.actitime.genericlib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser{
	/* driver Object is Global static & public variable*/
	 public static WebDriver driver;

	 /**
	  * launch the browser based on properties File key
	  * @throws Throwable
	  */
	public static void launchBrowser() throws Throwable {
		 /*create an Object to FileLib class to read the browser data from properties File*/
		FileLib fLib = new FileLib();
         String BROWSER = fLib.getPropertyFileData("browser");
         
         /*launch the browser*/
         if(BROWSER.equals("firefox")) {
                driver = new FirefoxDriver();
         }else if(BROWSER.equals("chrome")) {
      	     driver = new ChromeDriver();
         }else if(BROWSER.equals("ie")) {
    	     driver = new InternetExplorerDriver();
       }
	}
	/**
	 * close the browser
	 */
	public static void closeBrowser() {
		driver.close();
	}

}





