package com.arrays;
import java.util.Arrays;
public class MergeTwoArrays {
	public static void merge(int[] arr1,int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int[] n=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			n[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++) {
			n[arr1.length+j]=arr2[j];
		}
		Arrays.sort(n);
		System.out.println(Arrays.toString(n));
		
	}

	public static void main(String[] args) {
		int[] l1= {1,2,3,4,10,11};
		int[] l2= {7,8,9,1};
		merge(l1,l2);
	}

}


// *********** Another approach ***************

class MergeTwoArray {
	public static void merge(int[] arr1,int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int[] n=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			n[i]=arr1[i];
		}
		for(int j=0;j<arr2.length;j++) {
			n[arr1.length+j]=arr2[j];
		}
		for(int k=0;k<n.length;k++) {
			for(int l=k+1;l<n.length;l++) {
				if(n[k]>n[l]) {
					int temp=n[k];
					n[k]=n[l];
					n[l]=temp;
				}
				
			}
			
		}
		System.out.println(Arrays.toString(n));
		
	}

	public static void main(String[] args) {
		int[] l1= {1,2,3,4,10,11};
		int[] l2= {7,8,9,1};
		merge(l1,l2);
	}

}

