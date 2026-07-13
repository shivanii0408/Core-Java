package com.rays.basic;

public class Swap {
	public static void main(String[] args) {
		int a = 19;
		int b = 30;
		int temp;
		{
			System.out.println("a and b before swapping: " + a +b);
		}
		temp=a;
		a=b;
		b=temp;
		{
			System.out.println("a and b after swapping: " + a +b);
		}
	}
}
