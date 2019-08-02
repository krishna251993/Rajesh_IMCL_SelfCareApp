
package testPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class OpenApp {

	public static void main(String[] args) throws MalformedURLException, InterruptedException   {
		// TODO Auto-generated method stub
		
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "4200b684b2b91400");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "6.0.1");
		caps.setCapability("appPackage", "mobiotics.com.lcoselfcareimpl");
		caps.setCapability("appActivity", ".newui.splash.SplashActivity");
		//caps.setCapability("noReset", "true");
		
		URL url= new URL("http://0.0.0.0:4723/wd/hub");
		
		AndroidDriver<WebElement> driver=new  AndroidDriver<WebElement>(url,caps);
		Thread.sleep(5000);
		
		driver.findElement(By.id("mobiotics.com.lcoselfcareimpl:id/btnLogin")).click();
		driver.findElement(By.id("mobiotics.com.lcoselfcareimpl:id/editTextMobileNumber")).sendKeys("8884638980");
		driver.findElement(By.id("mobiotics.com.lcoselfcareimpl:id/editTextPassword")).sendKeys("Test@1234");
		driver.findElement(By.id("mobiotics.com.lcoselfcareimpl:id/btnLogin")).click();
		System.out.println("Testing");
		
		 

	}

}
