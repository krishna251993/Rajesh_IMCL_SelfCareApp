package com.mobiotics.IMCL_Selfcare.TestCases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "My Total cost is 5.225";
	    Pattern p = Pattern.compile("\\d*\\.\\d+");
	    Matcher m = p.matcher(s);
	    while(m.find()){
	        System.out.println(">> "+ m.group());
	    }
		
		
		/*  
		 * 
		 * 
		 * This piece of code will remove only and only the decimal value
		String rs="ABBB2715.59";
		String ru=rs.replaceAll("[^0-9]", " ");
		System.out.println("The extracted code="+ru);

		*/
	}

}
