package com.luv2code.codingproblems.strings;

public class CountOccurencesOfCharacters {

	
//	private static final String txt = " I love you";
	
	private static final String txt = "Hello Punu ";
	private static final char charToCount = 'u';
	public static void main(String[] args) {
		
		System.out.println("Input text is : "+ txt);
		System.out.println("charToCount is : "+ charToCount);
		
		int countV1 = countOccurencesOfCertainCharacter(txt,charToCount);
		
		System.out.println("count is : "+countV1);
		
		
		
	}
	private static int countOccurencesOfCertainCharacter(String txt, char chartocount) {
		
		if(txt == null || txt.isEmpty())
			return -1;
		System.out.println("length is "+ txt.length());
		System.out.println("modified string is "+ txt.replace(String.valueOf(chartocount), ""));
		return txt.length() - txt.replace(String.valueOf(chartocount),"").length();
		
		
	}
}

