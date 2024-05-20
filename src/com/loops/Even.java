package com.loops;

//********* Using for-each **********
public class Even {

	public static void main(String[] args) {
		int[] l= {3,1,2,41,200,50,31};
		for(int i:l) {
			if(i%2==0) {
				System.out.println(i);
			}
		}

	}

}

//************ Using For loop *******

class EvenOdd {
	public static void main(String[] args) {
		int[] nums= {1,5,2,7,12,3,4,9,20,24};
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				System.out.println(nums[i]+" ");
			}
		}
	}

}
