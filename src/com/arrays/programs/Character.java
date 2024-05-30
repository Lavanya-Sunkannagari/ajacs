package com.arrays.programs;
import java.util.Arrays;
public class Character {
	public static void character(char[] ch,char character) {
		boolean f=false;
		for(int i=0;i<ch.length;i++) {
			if(f) {
				System.out.print(ch[i]+" ");
			}
			if(ch[i]==character) {
				f=true;
			}
			
		}
		
	}

	public static void main(String[] args) {
		char[] ch= {'l','a','v','a','n','y','a'};
		char character='a';
		character(ch,character);
	}
}


