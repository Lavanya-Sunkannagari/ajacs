package com.arrays.programs;

import java.util.Arrays;

public class MissingNum {
	public static void missing(int[] arr) {
		Arrays.sort(arr);
		int b=arr[arr.length-1];
		int k=0;
		int[] New=new int[b];
		int s=arr[0];
		for(int i=s;i<b;i++) {
			if(k<arr.length && i==arr[k]) {
				k++;
			}
			else {
				New[i]=i;
			}
			
		}
		for(int n:New) {
			if(n!=0) {
				System.out.print(n+" ");
			}
		}
	}

	public static void main(String[] args) {
		int[] nums= {11,12,14,15,16};
		missing(nums);

	}

}
