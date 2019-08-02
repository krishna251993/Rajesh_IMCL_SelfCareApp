package com.mobiotics.IMCL_Selfcare_AddTopUpWalletPage;

import org.apache.log4j.Logger;
import org.aspectj.weaver.Iterators.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.mobiotics.IMCL_Selfcare.CommonPage.BasePage;

import generic.JavaUtills;

public class TopUpWalletPageTest extends BasePage {
	
	public TopUpWalletPageTest() {
		PageFactory.initElements(driver, this);
	}
	
	public static Logger logger=Logger.getLogger(TopUpWalletPageTest.class);
	@FindBy(xpath="//android.widget.Button[@index='11']")
	private WebElement topUp;
	
	@FindBy(xpath="//android.widget.TextView[@index='2']")
	private WebElement subscriberId;
	
	@FindBy(xpath="//android.widget.TextView[@index='6']")
	private WebElement currentBalance;
	
	@FindBy(xpath="//android.widget.TextView[@index='8']")
	private WebElement homePageCurreneBalance;
	
	@FindBy(xpath="//android.widget.TextView[@index='3']")
	private WebElement mobileNumber;
	
	@FindBy(xpath="//android.widget.EditText[@index='8']")
	private WebElement enterAmt;
	
	@FindBy(xpath="//android.widget.Button[@index='9']")
	private WebElement proceedToPay;
	
	@FindBy(id="card-number")
	private WebElement enterCardNumber;
	
	@FindBy(id="dcMonth")
	private WebElement selectMonth;
	
	@FindBy(id="dcYear")
	private WebElement selectYear;
	
	@FindBy(id="normalOptionCVVTxt")
	private WebElement enterCVV;
	
	@FindBy(id="btnSubmit")
	private WebElement payNow;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.widget.Button[2]" )
	private WebElement successBtn;
	
	
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[3]")
	private WebElement Months;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[4]")
	private WebElement year_2021;
	
	
	public void selectAnElement(WebElement element,String text) {
		Select select= new Select(element);
		select.selectByVisibleText(text);
		
	}
	
	public void addTopUp() throws InterruptedException {
		
		
		waitTillElementIsClickable(topUp);
		topUp.click();
		waitTillElementIsVisible(currentBalance);
		String currentBal=currentBalance.getText();
		System.out.println(currentBal);
		String currentBalString=JavaUtills.extractFloat(currentBal);
		float currntBalFloat=Float.parseFloat(currentBalString);
		log.info("Before Recharging the current balance is -"+currntBalFloat);
		System.out.println(currntBalFloat);
		log.info("Subscriber Id="+subscriberId.getText());
		waitTillElementIsVisible(mobileNumber);
		log.info("Mobile Number="+mobileNumber.getText());
		waitTillElementIsVisible(enterAmt);
		waitTillElementIsClickable(proceedToPay);
		
		enterAmt.sendKeys("1");
		proceedToPay.click();
		waitTillElementIsVisible(enterCardNumber);
		enterCardNumber.sendKeys("4242424242424242");
		
		selectMonth.click();
		Months.click();
		selectYear.click();
		year_2021.click();
		//selectAnElement(selectMonth, "11");
		//selectAnElement(selectYear, "2021");
	
		waitTillElementIsVisible(enterCVV);
		enterCVV.sendKeys("123");
		waitTillElementIsClickable(payNow);
		payNow.click();
		waitTillElementIsClickable(successBtn);
		successBtn.click();
		Thread.sleep(5000);
		String currentBalAfterTopUpString=JavaUtills.extractFloat(homePageCurreneBalance.getText());
		float currentBalAfterTopUpfloat=Float.parseFloat(currentBalAfterTopUpString);
		if(currentBalAfterTopUpfloat==currntBalFloat+1) {
			System.out.println("Ballance is added to the DPO_Parent customer");
			log.info("Ballance is added to the DPO_Parent customer");
		}
		else {
			log.info("Ballance is added to the DPO_Child customer");
		}
		
		
	}
	

}
