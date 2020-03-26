package com.luv2code.codingproblems.searching;

public class InterpolatinSearch {
	
	public static void main(String[] args) {
		
		int arr[] = {10,12,34,45,47,52,58,65,69,81,89,95};
		
		int elem = 69;
		
		int result = interpolationSearch(arr,elem);
		if(result == -1) 
			System.out.println("element not found in array");
		else
			System.out.println("Element found at index: "+result);
	}

	private static int interpolationSearch(int[] arr, int elem) {
		
		int start = 0; int end = arr.length - 1;
		
		while(start <= end && elem >= arr[start] && elem <= arr[end]) {
			
			if(start == end )
			{
				if(arr[start] == elem)
					return start;
				return -1;
			}
			
			int pos = start + (((end-start)/(arr[end]-arr[start]))* (elem-arr[start]));
			
			if(arr[pos] == elem)
				return pos;
			if(arr[pos] < elem)
				start = pos +1;
			else
				end = pos -1;
			
		}
		return -1;
		
	}

}
