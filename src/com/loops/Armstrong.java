package com.loops;

public class Armstrong {

	public static void main(String[] args) {
		int n=153;
		int number=n;
		int res=0;
		int num=String.valueOf(n).length();
		while(n!=0) {
			int dig=n%10;
			res+=Math.pow(dig,num);
			n/=10;
		}
		if(number==res) {
			System.out.println("Armstrong");
		}
		else {
			System.out.println("Not Armstrong");
		}

	}

}

