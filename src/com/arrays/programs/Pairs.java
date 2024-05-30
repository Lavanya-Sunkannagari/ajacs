package com.arrays.programs;

import java.util.Arrays;

public class Pairs {
	public static void pair(int[] arr,int n) {
		int sum=arr[0]+arr[1];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if((arr[i]+arr[j])==n) {
					
					System.out.println(Arrays.toString(new int[] {arr[i],arr[j]}));
				}
			}
		}
		
	}

	public static void main(String[] args) {
		int[] nums= {2,5,7,3,1,6,4};
		int n=7;
		pair(nums,n);
	}

}
