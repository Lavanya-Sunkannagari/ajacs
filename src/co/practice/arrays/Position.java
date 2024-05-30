package co.practice.arrays;

import java.util.Arrays;

public class Position {
	public static void position(int[] arr1,int[] arr2,int n) {
		int[] emp=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			emp[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++) {
			emp[arr1.length+j]=arr2[j];
		}
		Arrays.sort(emp);
		System.out.println(Arrays.toString(emp));
		for(int k=0;k<emp.length;k++) {
			if(k==n) {
				System.out.println(emp[k-1]);
			}
		}
	}

	public static void main(String[] args) {
		int[] nums1= {100,112,256,349,770};
		int[] nums2= {72,86,113,119,265,445,892};
		position(nums1,nums2,7);

	}

}
