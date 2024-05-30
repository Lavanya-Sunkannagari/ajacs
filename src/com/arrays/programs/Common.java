package com.arrays.programs;

import java.util.Arrays;
import java.util.ArrayList;
public class Common {
	public static void element(int[] arr1,int[] arr2) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr1[i]+" ");
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] nums1= {2,1,5,8,3,9};
		int[] nums2= {5,2,8,4,7};
		element(nums1,nums2);

	}

}
