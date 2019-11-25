package com.actitime.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * 
 * @author Deepak
 *
 */
public class WebDriverCmmonLib {
   /**
   * used to wait for Page to Load in GUI
   */
	public void waitForPageToLoad() {
		Browser.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	/**
	 * wait for element present in GUI
	 * @param element
	 */
	public void waitForElemnet(WebElement element) {
		WebDriverWait wait = new WebDriverWait(Browser.driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	/**
	 * custom wait for element present in GUI
	 * @param element
	 * @throws Throwable 
	 */
	public void waitForElemnetInGUI(WebElement element) throws Throwable {
		int count=0;
		while(count<=20) {
			try {
				element.isEnabled();
				break;
				
			}catch (Exception e) {
				Thread.sleep(1000);
				count++;
			}
		}
	}
	/**
	 * select the value from the dropDown based in Text
	 * @param element
	 * @param text
	 */
	public void select(WebElement element,String text) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	/**
	 * select the value from the dropDown based in index
	 * @param element
	 * @param index
	 */
	public void select(WebElement element,int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
}





