package com.rays.basic;

public class Palindrome_No {
	public static void main(String[] args) {
		int n = 122;
		int num = n;
		int r = 0;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		if(sum==num) {
		System.out.println("Palindrome no." + sum);
		}
		else {
			System.out.println("The no. is not Palindrome no." + sum);
		}
	}
}
