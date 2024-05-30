package com.arrays.programs;

import java.util.Arrays;

public class Occurrence {
	public static void occurrence(char[] ch,char character) {
		int c=0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i]==character) {
				c++;
				
			}
		}
		System.out.println("The no.of occurrences of character is:"+c);
	}

	public static void main(String[] args) {
		char[] chars= {'G','e','e','t','h','a'};
		char character='e';
		occurrence(chars,character);

	}

}
