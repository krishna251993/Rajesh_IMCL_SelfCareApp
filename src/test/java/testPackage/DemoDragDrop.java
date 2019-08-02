package testPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class DemoDragDrop {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "My Phone");
		caps.setCapability("udid", "192.168.1.6:5555");
		caps.setCapability("platformName", "Android");
		caps.setCapability("platformVersion", "8.1.0");
		caps.setCapability("appPackage", "com.whatsapp");
		caps.setCapability("appActivity", ".HomeActivity t27451");
		//This line of code is only used instalkl the , If you have the .apk file then onl;y you  shoul use the same
		//caps.setCapability(MobileCapabilityType.APP, "App Location");

		URL url= new URL("http://0.0.0.0:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,caps);
		
		//Navigation
		WebElement source=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\'Manoj Sheetal\']"));
		WebElement target=driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\'Mobiotics Babhav\']"));
		TouchAction action = new TouchAction((MobileDriver)driver);
		action.longPress(ElementOption.element(source)).moveTo(ElementOption.element(target)).release().perform();
		System.out.println("Drag and drop has been done");
	}

}
