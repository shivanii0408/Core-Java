package com.rays.basic;

public class Prime_No {
	public static void main(String[] args) {
		int n = 0;
		for (int i = 1; i <= 10; i++) {
			if (n % i == 0) {
				System.out.println("Prime no.");
			} else {
				System.out.println(" Not Prime no.");
			}
		}
	}
}
