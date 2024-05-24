package com.arrays;

import java.util.Arrays;

public class MoveZeros {
		public static void zeros(int[] arr) {
			
			int d=0;
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0) {
					arr[d++]=arr[i];
				}
			}
			while(d<arr.length) {
				arr[d++]=0;
			}
			
	}
		public static void main(String[] args) {
			int[] nums= {1,0,3,0,2,7,0,6};
			zeros(nums);
			System.out.println(Arrays.toString(nums));
		}
}
