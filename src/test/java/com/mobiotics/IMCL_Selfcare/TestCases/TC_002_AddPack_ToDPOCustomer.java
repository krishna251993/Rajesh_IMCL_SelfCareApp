package com.mobiotics.IMCL_Selfcare.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.IMCL_Selfcare.constant.BaseTest;
import com.mobiotics.IMCL_Selfcare_AddProductPage.AddProductPageTest;

public class TC_002_AddPack_ToDPOCustomer extends BaseTest{
	@Test
	public void addPackToDPOCustomer() {
		System.out.println(DPO_Status);
		if(DPO_Status==true) {
			AddProductPageTest addProductPageTest=new AddProductPageTest();
			addProductPageTest.addPack();
		}
		
		//System.out.println(LCO_Status);
		else if (LCO_Status==true){
			AddProductPageTest addProductPageTest=new AddProductPageTest();
			addProductPageTest.addPacksForLCOCustomer();
			
		}
		
		
	}
	
	

}
