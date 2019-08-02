package com.mobiotics.IMCL_Selfcare.TestCases;

import org.testng.annotations.Test;

import com.mobiotics.IMCL_Selfcare.constant.BaseTest;
import com.mobiotics.IMCL_Selfcare_AddTopUpWalletPage.TopUpWalletPageTest;

public class TC_001_TopUpDP_Customer extends BaseTest{
	
	@Test
	public void topUpToDpCustomer() throws InterruptedException {
		TopUpWalletPageTest topUpWalletPageTest= new TopUpWalletPageTest();
		topUpWalletPageTest.addTopUp();
	}

}
