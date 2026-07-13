package com.rays.basic;

public class String_Reverse1 {
	public static void main(String[] args) {
		String str = "Shivani123 Gehlot";
		for (int i = str.length() - 1; i >= 0; i--){
			System.out.println(str.charAt(i));
		}
	}
}
