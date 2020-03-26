package com.luv2code.codingproblems.searching;

//binary search - the array is sorted and reduce the time complexity to O(Log n).
//T(n) = T(n/2) + c 
public class BinarySearch {

	
	public static void main(String[] args) {
		int arr[] = {3,10,30,38,44,68,79,81,90};
		
		int elem = 44;
		int start = 0;
		int end = arr.length - 1;
		
		
		int result = iterativelyBinarySearch(arr,elem);
		if(result == -1)
			System.out.println("Element not found in array");
		else
			System.out.println("Element found at index: "+result);
		
		int recursiveResult = recursivelyBinarySearch(arr,start,end,elem);
		if(recursiveResult == -1)
			System.out.println("Element not found in array");
		else
			System.out.println("Element found at index: "+recursiveResult);
	
	}

	private static int recursivelyBinarySearch(int[] arr, int start, int end, int elem) {
		
		if(end >= start) {
			int mid = start + (end-start)/2;
			
			if(arr[mid] == elem)
				return mid;
			if(arr[mid] > elem)
				return recursivelyBinarySearch(arr, start, mid-1, elem);
			else
				return recursivelyBinarySearch(arr, mid+1, end, elem);
			
		}
	
		return -1;
	}

	private static int iterativelyBinarySearch(int[] arr, int elem) {
		
		
		int start = 0; int end = arr.length -1;
		while(start <= end) {
			
			int mid = start + (end-start)/2;
			System.out.println("mid is "+mid);
			
			if(arr[mid] == elem)
				return mid;
			if(arr[mid] < elem)
				start = mid+1;
			else
				end = mid-1;
			
		}
		return -1;
	}
}
