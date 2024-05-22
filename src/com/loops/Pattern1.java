package com.loops;

//public class Pattern1 {
//
//	public static void main(String[] args) {
//		int n=5;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				if(i==0 || j==0||i==n-1||j==n-1) {
//					System.out.print("*");
//				}
//				else {
//				System.out.print(" ");
//				}
//			}
//			
//			System.out.println();
//		}
//
//	}
//	
//
///////// ******** p-2 **********
//
//class Pattern2{
//	public static void main(String[] args) {
//		int n=6;
//		int num=1;
//		for(int i=0;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(num+" ");
//				num=num+1;
//			}
//			System.out.println();
//		}
//	}
//}
//
/////   ************* p-3 ****************
//
//class Pattern3{
//	//similar to inner loop
//	public static void printRow(int n) {
//		if(n==0) {
//			return;
//		}
//		System.out.print("* ");
//		
//		printRow(n-1);
//		}
//	
//	//similar to outer loop
//	public static void changeRow(int n) {
//		if(n==0) {
//			return;
//		}
//		changeRow(n-1);
//		printRow(n);
//		System.out.println("\n");
//	}
//	public static void main(String[] args) {
//		Pattern3.changeRow(5);
//	}
//}


////  ********* p-4 ********* ///

class Pattern4{
	public static void pyramid(int height) {
		int h1=height;
		for(int i=1;i<=h1;i++) {
			System.out.print((" ").repeat(height-1));
			System.out.println((i+" ").repeat(i));
			height-=1;
			}
		}
	public static void main(String[] args) {
		pyramid(4);
		}
	
	
}
