package com.mobiotics.IMCL_Selfcare.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.IMCL_Selfcare.constant.BaseTest;
import com.mobiotics.IMCL_Selfcare_MyPack.ManagePackPageTest;

public class TC_003_ManageMyPack_DP_customer extends BaseTest{
	@Test
	public void manageMyPack() {
		if(DPO_Status==true) {
		
			ManagePackPageTest managePackPageTest = new ManagePackPageTest();
			managePackPageTest.managePackDetails();
		}
		
		else if(LCO_Status==true) {
			ManagePackPageTest managePackPageTest = new ManagePackPageTest();
			managePackPageTest.managePackForLCOCustomer();
		}
		
		
	}

}
