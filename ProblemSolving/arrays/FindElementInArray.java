package com.luv2code.codingproblems.arrays;

import java.awt.List;
import java.util.Arrays;

public class FindElementInArray {
	
	public static void main(String[] args) {
		
		int arr[] = {5,1,1,9,7,2,6,10};
		
		//Integer arr[] = {5,1,1,9,7,2,6,10};
		
		int toCheckValue = 9;
		
		System.out.println("Array: "+Arrays.toString(arr));
		
	//	linearCheck(arr,toCheckValue);
		binaryCheck(arr,toCheckValue);
	//	listCheck(arr,toCheckValue);
	}

	

	private static void linearCheck(int[] arr, int toCheckValue) {
		
		boolean test = false;
		for(int element : arr) {
			if(element == toCheckValue) {
				test = true;
				break;
			}
		}
		System.out.println("Is "+toCheckValue+ " present in the array : "+test);
		
	}
	
	private static void binaryCheck(int[] arr,int toCheckValue) {
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int res = Arrays.binarySearch(arr, toCheckValue);
		System.out.println("res = "+res);
		
		boolean test = res > 0 ? true : false;
		
		System.out.println("Is "+toCheckValue + " present in the array : "+test);
	}

	private static void listCheck(Integer[] arr, int toCheckValue) {
		
		
		
		boolean test = Arrays.asList(arr).contains(toCheckValue);
		
		System.out.println("Is "+toCheckValue + " present in the array : "+test);
		
	}
	
}
