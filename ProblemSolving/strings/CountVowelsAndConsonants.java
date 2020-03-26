package com.luv2code.codingproblems.strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowelsAndConsonants {
	
	private static String text = "abcdfasfasaLuv123@!#$";
	
	public static void main(String[] args) {
		
		System.out.println("Input text is : "+ text);
		
	   countVowelsAndConsonants(text);
	   countVowelsAndConsonantsV2(text);
	}

	private static void countVowelsAndConsonants(String text) {
		
		int vowels  =0,consonants =0, specialChar = 0 ,digit = 0;
		
		for(int i = 0;i< text.length();i++) {
			
			char ch = text.charAt(i);
			if((ch >= 'a' && ch <= 'z') || (ch>='A'&& ch<='Z')) {
				
				ch = Character.toLowerCase(ch);
				if(ch  == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
					vowels++;
				else
					consonants++;
			}
			else if(ch >= '0' && ch <= '9')
				digit++;
			else
				specialChar++;
			
		}
		
		System.out.println("Vowels : "+ vowels);
		
		System.out.println("Consonants : "+consonants);
		System.out.println("Digits : "+digit);
		System.out.println("SpecialChars  : "+specialChar);
		
	}
	
	private static void countVowelsAndConsonantsV2(String text) {
		
		Set<Character> vowels = new HashSet<Character>(Arrays.asList('a','e','i','o','u'));
		
		text = text.toLowerCase();
		int vowelsCount = 0; int consonantsCount = 0;
		
		for(int i = 0 ;i< text.length();i++) {
			
			char ch = text.charAt(i);
			if(vowels.contains(ch)) {
				vowelsCount++;
			}
			else
			{
				consonantsCount++;
			}
		}
		System.out.println("Vowels : "+ vowelsCount);
		
		System.out.println("Consonants : "+consonantsCount);
		
	}

	

}
