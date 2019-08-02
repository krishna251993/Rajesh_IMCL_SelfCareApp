package com.mobiotics.IMCL_Selfcare.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.IMCL_Selfcare.constant.BaseTest;
import com.mobiotics.IMCL_Selfcare_MyProfile.MyProfileTest;

public class Tc_004_MyProfile extends BaseTest{
	
	@Test 
	public void myProfilePageTest() {
		if(DPO_Status==true) {
			
		}
		else if(LCO_Status==true) {
			MyProfileTest myProfileTest=new MyProfileTest();
			myProfileTest.getCustomerDetails();
			myProfileTest.updateProfile();
		}
	}

}
