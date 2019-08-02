package com.mobiotics.IMCL_Selfcare_MyProfile;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.mobiotics.IMCL_Selfcare.CommonPage.BasePage;

import generic.JavaUtills;
import io.appium.java_client.android.AndroidKeyCode;

public class MyProfileTest extends BasePage{
	
	public MyProfileTest() {
		PageFactory.initElements(driver, this);
	}
	
	public static Logger logger = Logger.getLogger(MyProfileTest.class);

	@FindBy(xpath="//android.widget.ImageButton[@content-desc='Open navigation drawer']")
	private WebElement menuBtn;
	
	
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='My Profile']")
	private WebElement myProfile;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/toolbarTitle")
	private WebElement myProfilePageTitle;
	
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/textViewName")
	private WebElement lcoName;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/textViewBasePackExpiresdis")
	private WebElement basePackExpirydate;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/textViewAccountNumberdis")
	private WebElement canNum;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/textViewMobileNumberdis")
	private WebElement mobileNumber;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/textViewEmailId")
	private WebElement emailId;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/textViewSettopBox")
	private WebElement setTopBox;
	
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/btnEditProfile")
	private WebElement editProfileBtn;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/editTextEmailId")
	private WebElement email;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/btnUpdate")
	private WebElement updateBtn;
	
	
	
	
	public void getCustomerDetails() {
		waitTillElementIsClickable(menuBtn);
		menuBtn.click();
		waitTillElementIsClickable(myProfile);
		myProfile.click();
		waitTillElementIsVisible(myProfilePageTitle);
		System.out.println(myProfilePageTitle.getText());
		if(myProfilePageTitle.getText().contains("My Profile")) {
			Assert.assertTrue(true);
			
			
			logger.info("LCO Name--"+lcoName.getText());
			logger.info("Base Pack Expiry Date--"+basePackExpirydate.getText());
			logger.info("Can Number Details--"+canNum.getText());
			logger.info("Mobile Number--"+mobileNumber.getText());
			logger.info("Email Id-"+emailId.getText());
			logger.info("Set Top Box--"+setTopBox.getText());
		}
		}
	
	@SuppressWarnings("deprecation")
	public  void updateProfile() {
		
		

		
		waitTillElementIsClickable(editProfileBtn);
		editProfileBtn.click();
		JavaUtills javaUtills=new JavaUtills();
		waitTillElementIsVisible(email);
		String emailId=javaUtills.generateRandomChars("MobioticsITSoftware", 5);
		email.sendKeys(emailId+"@mobiotics.com");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		


		waitTillElementIsClickable(updateBtn);
		updateBtn.click();
		if(this.emailId.getText().contains(emailId+"@mobiotics.com")) {
			logger.info("Email Id successfully updated");
			
		}
		
		
		
		
	}
}
