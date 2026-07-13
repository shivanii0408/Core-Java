package com.rays.basic;

public class Armstrong_No {
	public static void main(String[] args) {
		int num = 153;
		int n = num;
		int r = 0;
		int sum = 0;
		while (num > 0) {
			r = num % 10;
			sum = sum + (r * r * r);
			num = num / 10;
		}
		if (sum == n) {
			System.out.println("armstrong no " + n);
		} else {
			System.out.println("not armstrong no.: " + n);
		}
	}
}
