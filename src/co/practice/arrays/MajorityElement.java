package co.practice.arrays;

import java.util.Arrays;

public class MajorityElement {
	public static boolean major(int[] arr,int x) {
		int n=arr.length;
		int m=n/2;
		int c=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j] && arr[i]==x)
				c+=1;
				System.out.println(c);
			    if(c>=m) {
				return true;
			}
			
			
		}
		}
			
		return false;
	}

	public static void main(String[] args) {
		int[] nums= {1, 1, 2,2,2};
		System.out.println(major(nums,2));

	}

}
