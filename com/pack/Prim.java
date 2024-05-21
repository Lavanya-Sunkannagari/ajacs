package com.pack;
import java.util.Scanner;
public class Prim {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean x=true;
		//int n=12;
		if(n<=1) {
			x=false;
		}
		else {
			for(int i=2;i<n;i++) {
				if(n%i==0) {
					x=false;
					break;
				}
			}
		}
if(x) {
	System.out.println("Prime");
}
else {
	System.out.println("not prime");
}
s.close();
	}

}
