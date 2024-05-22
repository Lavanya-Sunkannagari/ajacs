package com.exceptions;
import java.util.Scanner;
public class NumberFException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		try {
			int n=Integer.parseInt(s);
		}catch(Exception e) {
			System.out.println("Exception handled");
		}
	}

}
