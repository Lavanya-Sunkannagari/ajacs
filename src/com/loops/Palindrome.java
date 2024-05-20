package com.loops;

public class Palindrome {

	public static void main(String[] args) {
		int n=121;
		int num=n;
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		System.out.println(rev);
		
		if(num==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}

}
