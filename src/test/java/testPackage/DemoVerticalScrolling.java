package testPackage;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DemoVerticalScrolling {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "4200b684b2b91400");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.1.0");
		caps.setCapability("appPackage", "mobiotics.com.lcoselfcareimpl");
		caps.setCapability("appActivity", ".newui.splash.SplashActivity");
		//This line of code is only used instalkl the , If you have the .apk file then onl;y you  shoul use the same
		//caps.setCapability(MobileCapabilityType.APP, "App Location");

		URL url= new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,caps);
		
		driver.findElement(By.id("mobiotics.com.lcoselfcareimpl:id/btnLogin")).click();
		driver.findElement(By.id("mobiotics.com.lcoselfcareimpl:id/editTextMobileNumber")).sendKeys("9038156237");
		driver.findElement(By.id("mobiotics.com.lcoselfcareimpl:id/editTextPassword")).sendKeys("Test@123");
		driver.findElement(By.id("mobiotics.com.lcoselfcareimpl:id/btnLogin")).click();
		 
		//AndroidElement list=(AndroidElement) driver.findElement(By.xpath("android.widget.TextView"));
		
		TouchAction action = new TouchAction((MobileDriver)driver);
		MobileElement listItem= (MobileElement) driver.findElement(
				MobileBy.AndroidUIAutomator(
						"new UiScrollable(new UiSelector()).scrollIntoView("
				+"new UiSelector().text(\"Top Sellers\"));"));
		System.out.println(listItem.getLocation());
		listItem.click();
	
		
		/*
		Dimension size = driver.manage().window().getSize();
		
		int startX=size.getWidth();
		int startY=size.getHeight();
		int endX=0;
		int endY=(int) (startY*-1*0.75);
		
		
		TouchAction action = new TouchAction((MobileDriver)driver);
		
		action.press (startX, startY)
	    .moveTo (endX, endY)
	    .release ()
	    .perform ();


	*/
	}

}
