package com.pack;
import java.util.Scanner;
public class Prime {

	public boolean prim(int n) {
		if(n<=1) {
			return false;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					return false;
				}
			}
		}
		return true;	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Prime p=new Prime();
		//p.prim(11);
		if(p.prim(n)) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		sc.close();
	}
}
