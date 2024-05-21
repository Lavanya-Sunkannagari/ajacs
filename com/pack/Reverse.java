package com.pack;

public class Reverse {

	public static void main(String[] args) {
		int n=12345;
		int rev=0;
		for(;n!=0;) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println(rev);
	}

}
