package com.arrays;
import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArray {
	public static void reverse(int[] arr) {
		int[] emp=new int[arr.length]; 
		for(int i=0;i<arr.length;i++) {
			emp[i]=arr[arr.length-1-i];
			}
		
		System.out.println(Arrays.toString(emp));
	}
	public static void main(String[] args) {
		int[] n= {1,2,3,4,5,6,7,8,9};
		reverse(n);
		
	}

}
