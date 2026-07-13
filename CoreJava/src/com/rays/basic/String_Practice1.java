package com.rays.basic;

public class String_Practice1 {
	public static void main(String[] args) {
		String str = "ram123sharma";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if(Character.isDigit(str.charAt(i))) {
				count++;
			}
		}
		System.out.println("Total Digits in count: "+count);
	}
}
