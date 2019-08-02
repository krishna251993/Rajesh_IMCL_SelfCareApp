package com.mobiotics.IMCL_Selfcare.constant;

import java.net.MalformedURLException;
import java.net.URL;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.mobiotics.IMCL_Selfcare.CommonPage.LoginPage;

import generic.Property;
import io.appium.java_client.android.AndroidDriver;

public class BaseTest implements AutomationConstants{
	
	public Logger log;
	//public static WebDriver driver;
	
	public static String un;
	public static String pw;
	public static String homePageURL;
	public static String loginPageURL;
	public static long timeout;
	public static URL url;
	
	public static String deviceName;
	public static String udid;
	public static String platformName;
	public static String platformVersion;
	public static String appPackage;
	public static String appActivity;
	
	public static AndroidDriver<WebElement> driver;
	
	public static boolean loginRequired=true;
	public static boolean logoutRequired=true;
	
	public static boolean DPO_Status;
	public static boolean LCO_Status;
	
	public BaseTest() {
		
		log=log.getLogger("LOg_ Logger");
		PropertyConfigurator.configure("Log4j.properties");
		log=Logger.getLogger(this.getClass());
		Logger.getRootLogger().setLevel(org.apache.log4j.Level.INFO);
	}

	public void initFrameWork() throws MalformedURLException {
		log.info("initilizing framework");
		//url=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "URL");
		un=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "UN");
		System.out.println(un);
		pw=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "PW");
		timeout=Long.parseLong(Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "IMPLICIT"));
		deviceName=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "deviceName");
		udid=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "udid");
		platformName=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "platformName");
		platformVersion=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "platFormVersion");
		appPackage=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "appPackage");
		appActivity=Property.getPropertyValue(CONFIG_PATH+CONFIG_FILE, "appActivity");
		
		
		
	}
	
	
	@BeforeMethod
	public void initApplication() throws Exception {
		initFrameWork();
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", deviceName);
		caps.setCapability("udid", udid);
		caps.setCapability("platformName", platformName);
		caps.setCapability("platformVersion", platformVersion);
		caps.setCapability("appPackage", appPackage);
		caps.setCapability("appActivity", appActivity);
		

		
		
		
		
		url= new URL("http://0.0.0.0:4723/wd/hub");
		driver=new AndroidDriver<WebElement>(url,caps);
		//driver.manage().window().maximize();
		
		preCondition();
		log.info("TimeOut:"+timeout);
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	
	public void preCondition() throws Exception {
		if(loginRequired) {
			log.info("implicit login");
			LoginPage loginpage=new LoginPage();
			loginpage.clickOnLogin();
			log.info("user clicked on the login Btn");
			Thread.sleep(5000);
			loginpage.setMobileNumber(un);
			log.info("user set the Mobile Number");
			Thread.sleep(5000);
			loginpage.setPassword(pw);
			log.info("user set the password");
			Thread.sleep(5000);
			loginpage.clickOnLogin();
			log.info("user clicked on the Login Btn");
			Thread.sleep(5000);
			
			//WebElement lcoLogin=driver.findElement(By.id("mobiotics.com.lcoselfcareimpl:id/toolbarLogo"));
			//WebElement lcoLogo=driver.findElement(By.id("mobiotics.com.lcoselfcareimpl:id/toolbarLogo"));
			if(loginpage.isTop_UpBtnDisplayed()) {
				log.info("user is successfully logged in");
				log.info("It's a DPO customer");
				log.info("DPO Customer Name:-"+loginpage.getDPOCustName());
				log.info(loginpage.getDPOCustName()+" having the credit balance="+loginpage.getCreditBalance());
				DPO_Status=true;
			}
			
			
			else {
				log.info("user successfully logged in");
				log.info("It's Lco customer");
				log.info("LCO Name:-"+loginpage.getFrName());
				log.info("Monthly Cost:-"+loginpage.getmonthlyCost());
				log.info("Base Pack Expire on:-"+loginpage.getBasePackExpiryDate());
				LCO_Status=true;
				
			}
			
			
			loginRequired=true;
			
		}
		
	}
	
	@AfterMethod
	public void tearDown() {
		
		LoginPage loginPage=new LoginPage();
		loginPage.logout();
		
	}
	
	
	

}
