package com.mobiotics.IMCL_Selfcare.CommonPage;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.IMCL_Selfcare.constant.BaseTest;
import com.mongodb.diagnostics.logging.Logger;

public class LoginPage  extends BasePage{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/btnLogin")
	public WebElement login;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/editTextMobileNumber")
	private WebElement enterMobile;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/editTextPassword")
	private WebElement enterPassword;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/btnLogin")
	private WebElement loginBtn;
	
	@FindBy(xpath="//android.widget.TextView[@index='4']")
	private WebElement mothlyCost;
	
	@FindBy(xpath="//android.widget.TextView[@index='5']")
	private WebElement basePackExpiryOn;
	
	@FindBy(xpath="//android.widget.TextView[@index='0']")
	private WebElement frName;
	
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/toolbarLogo")
	private WebElement lcoLogo;
	
	@FindBy(xpath="//android.widget.Button[@index='11']")
	private WebElement topUpBtn;
	
	@FindBy(xpath="//android.widget.TextView[@index='2']")
	private WebElement dpoCustName;
	
	@FindBy(xpath="//android.widget.TextView[@index='8']")
	private WebElement creditbalane;
	
	
	
	@FindBy(xpath="//android.widget.TextView[@text='Current balance']")
	private WebElement currentBalance;
	
	@FindBy(xpath="//android.widget.ImageButton[@content-desc='Open navigation drawer']")
	private WebElement mnuBtn;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/btnLogout")
	private WebElement logOutBtn;
	
	
	
	public boolean isTop_UpBtnDisplayed() {
		//waitTillElementIsClickable(topUpBtn);
		return isElementdisPlayed(topUpBtn);
	}
	
	public String getDPOCustName() {
		waitTillElementIsVisible(dpoCustName);
		return dpoCustName.getText();
	}
	
	public String getCreditBalance() {
		waitTillElementIsVisible(creditbalane);
		return creditbalane.getText();
	}
	
	public void clickToLogin() {
		
		waitTillElementIsClickable(login);
		login.click();
	}
	
	public void setMobileNumber(String mobileNo) {
		waitTillElementIsVisible(enterMobile);
		enterMobile.sendKeys(mobileNo);
	}
	
	public void setPassword(String pass)
	
	{
		waitTillElementIsVisible(enterPassword);
		enterPassword.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		waitTillElementIsClickable(loginBtn);
		loginBtn.click();
	}
	
	public String getmonthlyCost() {
		waitTillElementIsVisible(mothlyCost);
		return mothlyCost.getText();
		
	}
	
	public String getBasePackExpiryDate() {
		waitTillElementIsVisible(basePackExpiryOn);
		return basePackExpiryOn.getText();
	}
	
	public String getFrName() {
		waitTillElementIsVisible(frName);
		return frName.getText();
	}
	
	public boolean islcoLogoPresent() {
		try {
			waitTillElementIsVisible(lcoLogo);
			lcoLogo.isDisplayed();
			return true;
		} catch (Exception e) {
			System.out.println("Exception---"+e.getMessage());
			return false;
		}
	}
	
	public void performLoigin(String mob,String pw) {
		clickToLogin();
		setMobileNumber(mob);
		setPassword(pw);
		clickOnLogin();
		
	}
	
	public void logout() {
		waitTillElementIsClickable(mnuBtn);
		mnuBtn.click();
		waitTillElementIsClickable(logOutBtn);
		logOutBtn.click();
	}

}
