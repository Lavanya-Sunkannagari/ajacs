package com.arrays;
import java.util.Arrays;
public class Practice {
	public static int[] add(int[] arr,int t) {
		int[] narr=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==t) {
					return new int[]{i,j};
					
					}
				}
			}
		return null;
	}

			
			public static void main(String[] args) {
				int[] nums= {1,7,5,3};
				System.out.println(Arrays.toString(add(nums,9)));
			}
}
