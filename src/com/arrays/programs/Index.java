package com.arrays.programs;

import java.util.Arrays;

public class Index {
	public static void index(int[] arr,int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println(i);
				break;
			}
		}
		for(int j=arr.length-1;j>0;j--) {
			if(arr[j]==n) {
				System.out.println(j);
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] nums= {2,5,7,1,9,2,6};
		int n=2;
		index(nums,n);

	}

}
