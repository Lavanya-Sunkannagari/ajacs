package com.loops;
// Using for loop

public class Reverse {
	public static void main(String[] args) {
		int n=9391;
		int rev=0;
	 for(;n!=0;) {
			 int dig=n%10;
			 rev=rev*10+dig;
			 n=n/10;
		}
	System.out.println(rev);
	}
}		
		
		
//Using While loop

class ReverseDig{
	public static void main(String[] args) {
		int n=9391;
		int rev=0;
		while(n!=0) {
			int dig=n%10;
			rev=rev*10+dig;
			n/=10;
		}
		System.out.println(rev);
	}

}

// Using do-while

class ReverseDigit{
	public static void main(String[] args) {
		int n=456789;
		int rev=0;
		do {
			int dig=n%10;
			rev=rev*10+dig;
			n/=10;
		}while(n!=0);
		System.out.println(rev);
	}
}