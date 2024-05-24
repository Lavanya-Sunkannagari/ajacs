package com.arrays;

public class ArraySum {
	public static int sum(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[] nums=new int[] {10,20,30,40,50};
		System.out.println(sum(nums));
		
	}

}
