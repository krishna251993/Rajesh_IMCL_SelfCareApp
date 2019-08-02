package com.mobiotics.IMCL_Selfcare.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.mobiotics.IMCL_Selfcare.constant.BaseTest;

public class Login extends BaseTest{
	@Test
	public void testMethod() {
		System.out.println("This is the test Method");
		
		driver.findElement(By.className("android.widget.ImageButton")).click();
	}

}
