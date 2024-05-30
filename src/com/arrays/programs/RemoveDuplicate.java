package com.arrays.programs;
import java.util.Arrays;
public class RemoveDuplicate {
	public static void remove(int[] arr) {
		//Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int c=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					c=1;
					break;
				}
			}
			if(c==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	

	public static void main(String[] args) {
		int[] nums= {1,4,2,2,6,2,8,6,9};
		remove(nums);
	}

}
