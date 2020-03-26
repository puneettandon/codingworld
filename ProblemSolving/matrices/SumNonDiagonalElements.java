package com.luv2code.codingproblems.matrix;

public class SumNonDiagonalElements {
	
	public static void main(String[] args) {
		
	//	int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		System.out.println("length is "+arr[0].length);
		sumNonDiagonalElements(arr);
	}

	private static void sumNonDiagonalElements(int[][] arr) {
		
		int sum = 0;
		
		for(int i = 0;i< arr.length;i++) {
			for(int j = 0;j< arr[0].length;j++)
			{
				if(i == j || ((i+j) == (arr.length-1))) {
					continue;
				}
				sum = sum + arr[i][j];
			}
		}
		
		System.out.println("sum of arr is : "+sum);
		
	}

}
