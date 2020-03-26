package com.luv2code.codingproblems.arrays;

import java.util.Comparator;
import java.util.Random;

public class SortArray {
	
	private static int array_size = 100;
	private static String[] melon_types = {"Watermelon", "Cantaloupe", "Horned", "Crenshaw", "Honeydew",
            "Gac", "Bitter", "Winter", "Sprite", "Korean", "Canary", "Charentais",
            "Bailan", "Hami", "Santa Claus", "Sky Rocket", "Golden Langkawi", "Apollo",
            "Honey Globe", "Autumn Sweet", "Jade Dew", "Golden Prize", "Ten Me", "New Century"};
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int[] integers = new int[array_size];
		
		for(int i = 0;i< array_size;i++) {
			integers[i] = random.nextInt(array_size);
		}
	}

}
