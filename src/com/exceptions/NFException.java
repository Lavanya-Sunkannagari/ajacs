package com.exceptions;

import java.util.Scanner;

public class NFException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		try {
			int n=Integer.valueOf(s);
		}catch(NumberFormatException e) {
			System.out.println("Exception handled");
		}
		sc.close();

	}

}
