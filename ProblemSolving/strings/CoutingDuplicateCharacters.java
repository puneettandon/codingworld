package com.luv2code.codingproblems.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CoutingDuplicateCharacters {
	
	private static String text2 = "Be strong,be fearless,be beautiful.";
	private static String text3 = "CoutingDuplicateCharacters";
	private static String text = "HelloWorld";
	
	
	public static void main(String[] args) {
	
		System.out.println("Input text is : "+text);
		
		Map<Character,Integer> duplicates = countDuplicatesCharacters(text);
		
		System.out.println(Arrays.toString(duplicates.entrySet().toArray()));
		
	}

	private static Map<Character,Integer> countDuplicatesCharacters(String text) {
		
		if(text == null || text.isEmpty()) {
			return Collections.emptyMap();
		}
		
		Map<Character,Integer> result = new LinkedHashMap<>();
		
		for(int i = 0;i<text.length();i++) {
			
			char ch = text.charAt(i);
			if(result.containsKey(ch)) {
				result.put(ch, result.get(ch)+1);
			}
			else {
				result.put(ch,1);
			}
			
		}
		return result;
	}

}
