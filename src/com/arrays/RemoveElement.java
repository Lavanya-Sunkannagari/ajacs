package com.arrays;

import java.util.Arrays;

public class RemoveElement {
	public static int[] remove(int[] arr,int n) {
		int d=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				d++;
			}
		}
		int[] New=new int[arr.length-d];
		int e=0;
		for(int j:arr) {
			if(j!=n) {
				New[e++]=j;
			}
		}
		return New;
	}
		
	public static void main(String[] args) {
		int[] nums= {2,5,9,7,4};
		int n=9;
		System.out.println(Arrays.toString(remove(nums,n)));

	}

}






