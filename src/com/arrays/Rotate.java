package com.arrays;

import java.util.Arrays;

public class Rotate {
	public static int[] rotate(int[] arr,int ele) {
		int[] arr1=Arrays.copyOfRange(arr, arr.length-ele,arr.length);
		System.out.println(Arrays.toString(arr1));
		int[] arr2=Arrays.copyOfRange(arr,0, arr.length-ele);
		System.out.println(Arrays.toString(arr2));
		int[] narr=new int[arr.length];
		for(int i=0;i<narr.length;i++) {
			if(i>=arr1.length) {
				narr[i]=arr2[i-(arr1.length)];
			}
			else
				narr[i]=arr1[i];
		}
		return narr;
	}

	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5,6,7};
		
		System.out.println(Arrays.toString(rotate(arr,2)));

	}

}
