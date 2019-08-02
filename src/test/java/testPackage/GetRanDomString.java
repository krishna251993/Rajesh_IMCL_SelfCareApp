package testPackage;

import java.util.Random;

public class GetRanDomString {
	
	public static String generateRandomChars(String candidateChars, int length) {
	    StringBuilder sb = new StringBuilder();
	    Random random = new Random();
	    for (int i = 0; i < length; i++) {
	        sb.append(candidateChars.charAt(random.nextInt(candidateChars
	                .length())));
	    }

	    return sb.toString();
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name=generateRandomChars("Rajesh", 4);
		System.out.println(name);
	}

}
