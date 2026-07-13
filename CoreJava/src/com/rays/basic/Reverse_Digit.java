package com.rays.basic;

public class Reverse_Digit {
	public static void main(String[] args) {
		int n = 202521;
		int num = n;
		int r = 0;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		System.out.println("Reverse no." + sum);
	}
}
