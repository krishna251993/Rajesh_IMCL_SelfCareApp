package com.mobiotics.IMCL_Selfcare_AddProductPage;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobiotics.IMCL_Selfcare.CommonPage.BasePage;

import generic.JavaUtills;

public class AddProductPageTest extends BasePage{
	
	public AddProductPageTest() {
		PageFactory.initElements(driver, this);
	}
	public static Logger logger=Logger.getLogger(AddProductPageTest.class);
	
	@FindBy(xpath="//android.widget.ImageButton[@content-desc='Open navigation drawer']")
	private WebElement menuBtn;
	
	@FindBy(xpath="//android.widget.CheckedTextView[@text='Add Packs']")
	private WebElement addPack;
	
	@FindBy(xpath="//android.widget.TextView[@index='8']")
	private WebElement currentBalBeforeAddPack;
	
	@FindBy(xpath="//android.widget.TextView[@text='InDigital Packs']")
	private WebElement indigitalPack;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.CheckBox")
	private WebElement englishPlusCheckBox;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/txtAmount")
	private WebElement checkOutPrice;
	
	@FindBy(xpath="//android.widget.TextView[@text='Broadcaster Packs']")
	private WebElement broadcasterPack;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.CheckBox")
	private WebElement broadCasterePackCheckBox;
	
	
	@FindBy(xpath="//android.widget.TextView[@text='A-la-Carte']")
	private WebElement alacartePack;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.CheckBox")
	private WebElement alacarteCheckBox;
	
	@FindBy(xpath="//android.widget.Button[@text='CHECKOUT']")
	private WebElement checkOutBtn;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/textViewSubscriptionAmount")
	private WebElement totalSubscriptionAmt;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/textViewNCFAmount")
	private WebElement totalNCFPrice;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/textViewTaxAmount")
	private WebElement totalGST;
	
	@FindBy(xpath="//android.widget.TextView[@index='2']")
	private WebElement totalPortalPrice;
	
	
	@FindBy(xpath="//android.widget.Button[@text='PROCEED TO PAY']")
	private WebElement proceedToPayBtn;
	
	@FindBy(id="mobiotics.com.lcoselfcareimpl:id/btnGoHome")
	private WebElement btnToHome;
	
	public void addPack()

	{
		waitTillElementIsVisible(currentBalBeforeAddPack);
		String WalletBallStr=JavaUtills.extractFloat(currentBalBeforeAddPack.getText());
		float walletBatFloat=Float.parseFloat(WalletBallStr);
		
		waitTillElementIsClickable(menuBtn);
		menuBtn.click();
		waitTillElementIsClickable(addPack);
		addPack.click();
		waitTillElementIsClickable(indigitalPack);
		indigitalPack.click();
		waitTillElementIsClickable(englishPlusCheckBox);
		englishPlusCheckBox.click();
		waitTillElementIsVisible(checkOutPrice);
		log.info("After Selecting Indigital Pack the checkOut Price-"+checkOutPrice.getText());
		System.out.println("After Selecting Indigital Pack the checkOut Price-"+checkOutPrice.getText());
		waitTillElementIsClickable(broadcasterPack);
		broadcasterPack.click();
		waitTillElementIsClickable(broadCasterePackCheckBox);
		broadCasterePackCheckBox.click();
		log.info("After Selecting Broad Caster Pack Pack the checkOut Price-"+checkOutPrice.getText());
		System.out.println("After Selecting Broad Caster Pack Pack the checkOut Price-"+checkOutPrice.getText());
		waitTillElementIsClickable(alacartePack);
		alacartePack.click();
		waitTillElementIsClickable(alacarteCheckBox);
		alacarteCheckBox.click();
		log.info("After Selecting Alacarte Pack the checkOut Price-"+checkOutPrice.getText());
		System.out.println("After Selecting Alacarte Pack the checkOut Price-"+checkOutPrice.getText());
		
		float floatValAfterSele=Float.parseFloat(checkOutPrice.getText());
		waitTillElementIsClickable(checkOutBtn);
		checkOutBtn.click();
		
		String totalSubscriptionPricesString=JavaUtills.extractFloat(totalSubscriptionAmt.getText());
		
		System.out.println(totalSubscriptionPricesString);
		float totalSubscriptionPriceFloat=Float.parseFloat(totalSubscriptionPricesString);
		System.out.println("Total subscription Price"+totalSubscriptionPriceFloat);
		String totalNCFPriceString=JavaUtills.extractFloat(totalNCFPrice.getText());
		float totalNCFPriceFloat=Float.parseFloat(totalNCFPriceString);
		
		String totalGSTPrice=JavaUtills.extractFloat(totalGST.getText());
		float totalGSTPriceFloat=Float.parseFloat(totalGSTPrice);
		
		float totalCalculated=totalSubscriptionPriceFloat+totalNCFPriceFloat+totalGSTPriceFloat;
		System.out.println("Total calculated price--"+totalCalculated);
		log.info("Total Calculated Prise:---"+totalCalculated);
		waitTillElementIsClickable(proceedToPayBtn);
		proceedToPayBtn.click();
		
		waitTillElementIsVisible(btnToHome);
		btnToHome.click();
		
		
	}
	
	
	//---------------------------------------To add the Pack For LCO customer-------------------------
	
	public void addPacksForLCOCustomer() {
		
		
		//waitTillElementIsVisible(currentBalBeforeAddPack);
		//String WalletBallStr=JavaUtills.extractFloat(currentBalBeforeAddPack.getText());
		//float walletBatFloat=Float.parseFloat(WalletBallStr);
		//log.info("before adding the pack wallet balance is-- "+ walletBatFloat);
		waitTillElementIsClickable(menuBtn);
		menuBtn.click();
		waitTillElementIsClickable(addPack);
		addPack.click();
		waitTillElementIsClickable(indigitalPack);
		indigitalPack.click();
		waitTillElementIsClickable(englishPlusCheckBox);
		englishPlusCheckBox.click();
		waitTillElementIsVisible(checkOutPrice);
		log.info("After Selecting Indigital Pack the checkOut Price-"+checkOutPrice.getText());
		System.out.println("After Selecting Indigital Pack the checkOut Price-"+checkOutPrice.getText());
		waitTillElementIsClickable(broadcasterPack);
		broadcasterPack.click();
		waitTillElementIsClickable(broadCasterePackCheckBox);
		broadCasterePackCheckBox.click();
		log.info("After Selecting Broad Caster Pack Pack the checkOut Price-"+checkOutPrice.getText());
		System.out.println("After Selecting Broad Caster Pack Pack the checkOut Price-"+checkOutPrice.getText());
		waitTillElementIsClickable(alacartePack);
		alacartePack.click();
		waitTillElementIsClickable(alacarteCheckBox);
		alacarteCheckBox.click();
		log.info("After Selecting Alacarte Pack the checkOut Price-"+checkOutPrice.getText());
		System.out.println("After Selecting Alacarte Pack the checkOut Price-"+checkOutPrice.getText());
		
		float floatValAfterSele=Float.parseFloat(checkOutPrice.getText());
		waitTillElementIsClickable(checkOutBtn);
		checkOutBtn.click();
		
		String totalSubscriptionPricesString=JavaUtills.extractFloat(totalSubscriptionAmt.getText());
		
		System.out.println(totalSubscriptionPricesString);
		float totalSubscriptionPriceFloat=Float.parseFloat(totalSubscriptionPricesString);
		System.out.println("Total subscription Price"+totalSubscriptionPriceFloat);
		String totalNCFPriceString=JavaUtills.extractFloat(totalNCFPrice.getText());
		float totalNCFPriceFloat=Float.parseFloat(totalNCFPriceString);
		
		String totalGSTPrice=JavaUtills.extractFloat(totalGST.getText());
		float totalGSTPriceFloat=Float.parseFloat(totalGSTPrice);
		
		float totalCalculated=totalSubscriptionPriceFloat+totalNCFPriceFloat+totalGSTPriceFloat;
		System.out.println("Total calculated price--"+totalCalculated);
		log.info("Total Calculated Prise:---"+totalCalculated);
		waitTillElementIsClickable(proceedToPayBtn);
		proceedToPayBtn.click();
		
		waitTillElementIsVisible(btnToHome);
		btnToHome.click();

		
		
		
	}
		


	
	

}
