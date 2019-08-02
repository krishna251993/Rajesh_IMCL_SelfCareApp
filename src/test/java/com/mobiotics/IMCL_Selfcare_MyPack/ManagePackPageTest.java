package com.mobiotics.IMCL_Selfcare_MyPack;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.IMCL_Selfcare.CommonPage.BasePage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class ManagePackPageTest extends BasePage {
	
	public ManagePackPageTest() {
		PageFactory.initElements(driver, this);
	}
	
	public static Logger logger=Logger.getLogger(ManagePackPageTest.class);
	
	@FindBy(xpath="//android.widget.ImageButton[@content-desc='Open navigation drawer']")
	private WebElement menuBtn;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/btnExpand")
	private WebElement myPackExpands;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='Manage']")
	private WebElement manage;
	
	@FindBy(xpath="//android.widget.TextView[@text='Base Pack']")
	private WebElement basePack;
	
	@FindBy(xpath="//android.widget.TextView[@text='InDigital Bouquets']")
	private WebElement indigitalPack;

	@FindBy(xpath="//android.widget.TextView[@text='Broadcaster Bouquets']")
	private WebElement broadcasterPack;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[5]")
	private WebElement viewAllBasePack;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[5]")
	private WebElement viewAllIndigitalPacks;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[5]")
	private WebElement viewAllBroadcasterPack;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/textView")
	List<WebElement> allBasePack;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/btnBack")
	private WebElement backBtn;
	
	@FindBy(xpath="//android.widget.Button[@text='Add new pack']")
	private WebElement addNewPack;
	
	@FindBy(xpath="//android.widget.TextView[@text='InDigital Packs']")
	private WebElement indigitalPackAdd;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.CheckBox")
	private WebElement englishPlusCheckBox;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/btnCheckout")
	private WebElement checkOutBtn;
	
	

	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/pay_btn")
	private WebElement proceedToPay;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/btnGoHome")
	private WebElement backToHome;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='Renew']")
	private WebElement renew;
	
	@FindBy(xpath="android.view.ViewGroup")
	private List<WebElement> allRenewPack;
	
	@FindBy(xpath="//android.widget.Button[@text='Proceed To Pay']")
	private WebElement proceedToPayBtn;
	
	@FindBy(id="card-number")
	private WebElement cardNumber;
	
	@FindBy(id="dcMonth")
	private WebElement monthSelect;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]")
	private WebElement selectMonth;
	
	@FindBy(id="dcYear")
	private WebElement yearSelect;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]")
	private WebElement selectYear;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[17]/android.view.View[2]/android.view.View[3]/android.view.View[6]/android.widget.EditText")
	private WebElement cVV;
	
	@FindBy(id="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.view.View[17]/android.view.View[2]/android.view.View[5]/android.widget.Button")
	private WebElement payNowBtn;
	
	@FindBy(id="btnSubmit")
	private WebElement payNow;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.widget.Button[2]")
	private WebElement successFullBtn;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/btnGoHome")
	private WebElement backToHomeBtn;
	
	
	
	
	
	
	public void getAllPacksDetails(List<WebElement> elements) {
		int size=elements.size();
		System.out.println("Number Of Element present-"+size);
		for(int i=1;i<size;i++) {
			WebElement element=elements.get(i);
			String text=element.getText();
			System.out.println(text);
			//logger.info("------All Available Packs are-------");
			logger.info(text);
			
		}
	}
	
	public void managePackDetails() {
		waitTillElementIsClickable(menuBtn);
		menuBtn.click();
		waitTillElementIsClickable(myPackExpands);
		myPackExpands.click();
		waitTillElementIsClickable(manage);
		manage.click();
		logger.info("All Packs of "+basePack.getText());
		waitTillElementIsClickable(viewAllBasePack);
		viewAllBasePack.click();
		logger.info("------All Available Packs are-------");
		getAllPacksDetails(allBasePack);
		waitTillElementIsClickable(backBtn);
		backBtn.click();
		logger.info("All Packs of "+indigitalPack.getText());
		waitTillElementIsClickable(viewAllIndigitalPacks);
		viewAllIndigitalPacks.click();
		logger.info("------All Available Packs are-------");
		getAllPacksDetails(allBasePack);
		backBtn.click();
		
		logger.info("All Packs of "+broadcasterPack.getText());
		waitTillElementIsClickable(viewAllBroadcasterPack);
		viewAllBroadcasterPack.click();
		logger.info("------All Available Packs are-------");
		getAllPacksDetails(allBasePack);
		backBtn.click();
		waitTillElementIsClickable(addNewPack);
		addNewPack.click();
		
		waitTillElementIsClickable(indigitalPackAdd);
		indigitalPackAdd.click();
		englishPlusCheckBox.click();
		
		
		waitTillElementIsClickable(checkOutBtn);
		checkOutBtn.click();
		waitTillElementIsClickable(proceedToPay);
		proceedToPay.click();
		
		waitTillElementIsClickable(backToHome);
		backToHome.click();
		
	}
	
	public void selectAnElement(WebElement element,String visibleText) {
		waitTillElementIsVisible(element);
		Select select=new Select(element);
		select.selectByVisibleText(visibleText);
	}
	
	public void managePackForLCOCustomer() {
		
		
		MobileElement listItem= (MobileElement) driver.findElement(
				MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector()).scrollIntoView("
				+"new UiSelector().text(\"My Account\"));"));
		System.out.println(listItem.getLocation());
		//listItem.click();
		waitTillElementIsClickable(menuBtn);
		menuBtn.click();
		waitTillElementIsClickable(myPackExpands);
		myPackExpands.click();
		waitTillElementIsClickable(renew);
		renew.click();
		
		getAllPacksDetails(allRenewPack);
		waitTillElementIsClickable(proceedToPay);
		proceedToPay.click();
		cardNumber.sendKeys("4242424242424242");
		monthSelect.click();
		selectMonth.click();
		yearSelect.click();
		selectYear.click();
		//selectAnElement(monthSelect, "03");
		//selectAnElement(yearSelect, "2022");
		cVV.sendKeys("123");
		waitTillElementIsClickable(payNow);
		payNow.click();
		waitTillElementIsVisible(successFullBtn);
		successFullBtn.click();
		waitTillElementIsVisible(backToHomeBtn);
		backToHomeBtn.click();
		
	}
	
	public void manageMyPack() {
		
		waitTillElementIsClickable(menuBtn);
		menuBtn.click();
		waitTillElementIsClickable(myPackExpands);
		myPackExpands.click();
		waitTillElementIsClickable(manage);
		manage.click();
		
		
		//for scrolling down
		
		MobileElement listItem= (MobileElement) driver.findElement(
				MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector()).scrollIntoView("
				+"new UiSelector().text(\"Broadcaster Bouquets\"));"));
		
		System.out.println(listItem.getLocation());
		
		
	}
	

}
