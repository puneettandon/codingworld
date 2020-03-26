package com.luv2code.codingproblems.arrays;

import java.util.Arrays;

public class CheckArraysEqual {
	
	public static void main(String[] args) {
		
		int arr1[]  = new int[] {1,2,3,4};
		int arr2[] = new int[] {1,2,3,4};
		int arr3[] = new int[] {1,2,4,3};
		
		System.out.println("is arr1 equals to arr2: "+Arrays.equals(arr1, arr2));
		System.out.println("is arr1 equals to arr3: "+Arrays.equals(arr1, arr3));
		
		Student [] arr4 = {new Student(111, "bbbb", "london"), 
                new Student(131, "aaaa", "nyc"), 
                new Student(121, "cccc", "jaipur")}; 

		Student [] arr5 = {new Student(111, "bbbb", "london"), 
                new Student(131, "aaaa", "nyc"), 
                new Student(121, "cccc", "jaipur")}; 

		Student [] arr6 = {new Student(111, "bbbb", "london"), 
				 new Student(131, "aaaa", "nyc"),
                new Student(121, "dddd", "jaipur"), 
               
                }; 

		System.out.println("is arr4 equals to arr5 : " + 
                         Arrays.equals(arr4, arr5)); 
		System.out.println("is arr1 equals to arr3 : " + 
                         Arrays.equals(arr4, arr6)); 
	}
	
	

}

class Student{
	
	int rollno; 
	String name,address;
	
	public 	Student(int rollno,String name,String address) {
		
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	
	public boolean equals(Object obj) {
		
		Student s = (Student)obj;
		return this.rollno == s.rollno && this.name == s.name && this.address == s.address;
	}
}
