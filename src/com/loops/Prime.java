package com.loops;
import java.util.Scanner;

// ************** Prime or not(Without using method) *********
public class Prime {

	public static void main(String[] args) {
		int n=14;
		boolean m=true;
		if(n<=1) {
			m=false;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					m=false;
					break;
				}
			}
		}
		
if(m) {
	System.out.println("prime");
}
else {
	System.out.println("not");
}
	}

}


// ********    Another approach(Using method) *******

class Prim{
	public static boolean primeNum(int n) {
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
		Prim p=new Prim();
		if(p.primeNum(n)) {
			System.out.println("prime");
		}
		else {
			System.out.println("not");
		}
		sc.close();
	}
}

