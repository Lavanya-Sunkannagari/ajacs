package com.arrays;
import java.util.Arrays;
public class SecondLargest {
	public static int largest(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length-2];
	}

	public static void main(String[] args) {
		int[] nums= {6,2,9,5,1,10,40,500,1000};
		System.out.println(largest(nums));
	}
}

