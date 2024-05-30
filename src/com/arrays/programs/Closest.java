package com.arrays.programs;
import java.util.*;
public class Closest {
	public static void close(int[] arr,int n) {
		int closenum=arr[0];
		int smadiff=Math.abs(arr[0]-n);
		for(int i=0;i<arr.length;i++) {
			int curdiff=Math.abs(arr[i]-n);
			if(curdiff<smadiff && arr[i]!=n) {
				smadiff=curdiff;
				System.out.println(smadiff);
				closenum=arr[i];
				
			}
		}
		System.out.println(closenum);
	}

	public static void main(String[] args) {
		int[] nums= {1,5,8,7,12};
		int n=5;
		close(nums,n);
 
	}

}
