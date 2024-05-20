package com.loops;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=0,n2=1,n3=0;
		for(int i=0;i<n;i++) {
			System.out.println(n3);
			n1=n2;
			n2=n3;
			n3=n1+n2;
			
		}
		sc.close();
	}
	

}
