package com.luv2code.codingproblems.strings;

public class CheckWhetherStringContainsOnlyDigits {
	
	private static String onlyDigits = "abcdefA";
	
	public static void main(String[] args) {
		
		System.out.println("onlyDigits string is : "+onlyDigits);
		
	//	boolean isOnlyDigits = containsOnlyDigitsV1(onlyDigits);
		
	//	boolean isOnlyDigits = containsOnlyDigitV2(onlyDigits);
		
	//	boolean isOnlyAlpha = containsOnlyAlphabetsV1(onlyDigits);
		
		boolean isOnlyAlpha = containsOnlyAlphabetsV2(onlyDigits);
		
		
	//	System.out.println("Contains only digits - "+isOnlyDigits);
		
		System.out.println("Contains only alphabets - "+ isOnlyAlpha);
		
		
		
	}

	

	private static boolean containsOnlyDigitsV1(String text) {
		
		if(text == null || text.isEmpty())
			return false;
		for(int i = 0;i < text.length();i++) {
			
			if(!Character.isDigit(text.charAt(i)))
			{
				return false;
			}
		}
		return true;
	}
	
	private static boolean containsOnlyDigitV2(String text) {
		
		if(text == null || text.isEmpty()) {
			return false;
		}
		
		return text.matches("[0-9]+");
	}
	
	private static boolean containsOnlyAlphabetsV1(String text) {
		
		if(text == null || text.isEmpty())
			return false;
		
		for(int i = 0;i<text.length();i++) {
			if(!Character.isAlphabetic(text.charAt(i))) {
				return false;
			}
		}
		return true;
		
	}
	
private static boolean containsOnlyAlphabetsV2(String text) {
		
		if(text == null || text.isEmpty())
			return false;
		
		return text.matches("[a-zA-Z]+");
	}

}
