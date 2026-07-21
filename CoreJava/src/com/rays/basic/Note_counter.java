package com.rays.basic;

public class Note_counter {
	public static void main(String[] args) {
		int money = 6750;
		int[] arr = { 1000, 500, 200, 100, 50 };
        int count=0;
    	for (int note : arr) {
			count = money / note;
			if (count > 0) {
				System.out.println("total note of " + note + " is: " + count);
			}
			money = money % note;
		}
	}
}
