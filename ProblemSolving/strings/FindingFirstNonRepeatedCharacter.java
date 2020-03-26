package com.luv2code.codingproblems.strings;

public class FindingFirstNonRepeatedCharacter {

	private static final int EXTENDED_ASCII_CODES = 256;

	private static String text2 = "\"My high school, the Illinois Mathematics and Science Academy, \"\r\n" + 
			"            + \"showed me that anything is possible and that you're never too young to think big. \"\r\n" + 
			"            + \"At 15, I worked as a computer programmer at the Fermi National Accelerator Laboratory, \"\r\n" + 
			"            + \"or Fermilab. After graduating, I attended Stanford for a degree in economics and \"\r\n" + 
			"            + \"computer science.";
	
	private static String text = "hheelloa";
	
	public static void main(String[] args) {
		
		System.out.println("Input text is : "+text);
		
		//char firstChar = firstNonRepeatedCharacter(text);
		
		char firstChar = firstNonRepeatedCharacterV2(text);

		
		System.out.println("char is "+firstChar);
		
		
		
	}

	
	private static char firstNonRepeatedCharacter(String text) {
		
		if(text == null || text.isEmpty())
		{
			return Character.MIN_VALUE;
		}
		
		else {
			for(int i = 0;i < text.length();i++)
			{
				char ch = text.charAt(i);
				
				int count = 0;
				for(int j = 0;j<text.length();j++) {
					if(ch == text.charAt(j) && i != j) {
						count++;
						break;
					}
				}
				
				if(count == 0)
					return ch;
			}
			
		}
		return Character.MIN_VALUE;
	}
	
	private static char firstNonRepeatedCharacterV2(String text) {
		
		if(text == null || text.isEmpty())
			return Character.MIN_VALUE;
		
		int[] flags = new int[EXTENDED_ASCII_CODES];
		
		for(int i = 0;i< flags.length;i++) {
			flags[i] = -1;
		}
		
		for(int i= 0;i< text.length();i++) {
			
			char ch = text.charAt(i);
			
			if(flags[ch] == -1)
			{
				flags[ch] = i;
			}
			else {
				flags[ch] = -2;
			}
		}
		
		int position = Integer.MAX_VALUE;
		
		for(int i = 0;i< EXTENDED_ASCII_CODES;i++) {
			
			if(flags[i] >= 0) {
				position  = Math.min(position, flags[i]);
			}
		}
		
		return position == Integer.MAX_VALUE ? Character.MIN_VALUE : text.charAt(position);
		
	}
}
