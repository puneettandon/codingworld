package com.luv2code.codingproblems.matrix;

import java.util.Arrays;

public class SumTwoMatrices {
	
	public static void main(String[] args) {
		
		int a[][] = {{1,2},
					 {3,4}};
		int b[][] = {{5,6},
				     {7,8}};
		
		sumTwoMatrices(a,b);
}

	private static void sumTwoMatrices(int[][] a, int[][] b) {
		int c[][] = new int[a.length][a[0].length];

		for(int i = 0;i< a.length;i++) {
			for(int j = 0;j< a[0].length;j++) {
				
				c[i][j] = a[i][j] + b[i][j];
			}
		}
	
		
	}
	
}
