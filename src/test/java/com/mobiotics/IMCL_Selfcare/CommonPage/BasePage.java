package com.mobiotics.IMCL_Selfcare.CommonPage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import com.mobiotics.IMCL_Selfcare.constant.AutomationConstants;
import com.mobiotics.IMCL_Selfcare.constant.BaseTest;

import generic.Property;
import io.appium.java_client.android.AndroidDriver;


public class BasePage {

	public Logger log=Logger.getLogger(this.getClass());
	public AndroidDriver<WebElement> driver;
	public String configFile;
	public long timeout;
	
	public BasePage() {
		this.driver=BaseTest.driver;
		configFile=AutomationConstants.CONFIG_PATH+AutomationConstants.CONFIG_FILE;
		timeout=Long.parseLong(Property.getPropertyValue(configFile, "EXPLICIT"));
		
	}
	
	public void waitTillElementIsVisible(WebElement Element)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(Element));
	}
	
	public void verifyURLis(String expectedUrl)
	{
		new WebDriverWait(driver, timeout).until(ExpectedConditions.urlToBe(expectedUrl));
		
	}
	
	 public boolean verifyURLhas(String expectedURL) {
		 return new WebDriverWait(driver, timeout).until(ExpectedConditions.urlContains(expectedURL));
		 
	 }
	 
	 public void moveToElement(WebElement element) {
		 Actions actions=new Actions(driver);
		 actions.moveToElement(element).perform();
	 }
	 
	 public boolean isElementdisPlayed(WebElement element) {
		 try {
			element.isDisplayed();
			
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("element is not displayed Exception "+e.getMessage());
			return false;
		}
	 }
	
	 
	 
	 public void waitTillElementIsClickable(WebElement element)
		{
			new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		}
	 
	 
	 
	
	
}
