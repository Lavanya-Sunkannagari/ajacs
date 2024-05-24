package com.arrays;

public class IndexElement {
	public static int index(int[] arr) {
		int target=9;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				return i;
				
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] nums= {1,5,3,2,3,7,9};
		System.out.println(index(nums));
	}

}
