package com.arrays;
import java.util.Arrays;

public class Maximum {
	public static int maximum(int[] arr) {
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			
			}
		}
		return max;
	
	}

	public static void main(String[] args) {
		int[] num= {1,6,2,8,500,16,35,2,9,0,70};
		System.out.println(maximum(num));
	}
}

//********** Another approach ************

class MaxValue{
	public static int maximum(int[] arr) {
		Arrays.sort(arr);
	return arr[arr.length-1];
	}
	public static void main(String[] args) {
		int[] nums= {20,45,32,75,96,30,120};
		System.out.println(maximum(nums));
	}
	
}