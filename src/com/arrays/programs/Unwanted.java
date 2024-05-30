package com.arrays.programs;
import java.util.Arrays;
public class Unwanted {
	private static String[] name(String[] arr,String regex) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=arr[i].replaceAll(regex, "");
		}
		return arr;
	}
	public static void main(String[] args) {
		String[] arrs= {"lavs123","Geetha143","likki"};
		System.out.println(Arrays.toString(name(arrs,"[j-k]")));
	}



}
