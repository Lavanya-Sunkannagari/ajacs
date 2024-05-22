package com.exceptions;

public class NestedTCatch {

	public static void main(String[] args) {
		int n1=10;
		int n2=4;
		int[] arr=new int[10];
		try {
			
			System.out.println(n1/n2);
			try {
				System.out.println(arr[20]);
			}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println("Out of bounds exception handled");
					}
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic exception handled");
		}
	}

}
