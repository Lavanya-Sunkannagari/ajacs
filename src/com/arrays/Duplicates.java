package com.arrays;

public class Duplicates {
	public static boolean duplicate(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					return true;
				}
			}
		
		}
		return false;
	}

	public static void main(String[] args) {
		int[] nums= {1,2,4,3,6,2};
		System.out.println(duplicate(nums));

	}

}
