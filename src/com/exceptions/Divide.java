package com.exceptions;

public class Divide {

	public static void main(String[] args) {
		int n1=20;
		int n2=0;
			try {
				System.out.println(n1/n2);
			}catch(ArithmeticException e) {
				System.out.println("Exception handled");
			}
	}

}
