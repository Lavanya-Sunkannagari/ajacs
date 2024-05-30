package com.arrays.programs;
import java.util.Arrays;
public class Duplicate {
	public static void duplicate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] nums= {1,4,1,6,4,2,2,8,9,9};
		duplicate(nums);
	}

}
