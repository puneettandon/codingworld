package com.luv2code.codingproblems.searching;
// time complexity is O(n)
// Linear search is rarely used practically 
//because other search algorithms such as the binary search algorithm and hash tables 
//allow significantly faster searching comparison to Linear search. 
public class LinearSearch {
	
	public static void main(String[] args) {
		
		int arr[] = {2,3,4,9,10};
		int x= 2;
		
		int result = search(arr,x);
		if(result == -1 )
			System.out.println("Element not found in array");
		else
			System.out.println("Element found at index: "+result);
	}

	private static int search(int[] arr, int x) {
		
		for(int i = 0;i<arr.length;i++) {
			
			if(arr[i] == x)
				return i;	
		}
		return -1;
	}

}
