package com.rays.basic;

import java.util.Scanner;

public class Calculator_scanner {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two integers : ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("a: "+a );
	System.out.println("b: "+b );


	System.out.println("select your one operation(-, +, *, /, %)");
	String opr = sc.next();

	
	switch (opr) {
	case "+":
		System.out.println("result: " + (a + b ));
		break;
	case "-":
		System.out.println("result: " + (a-b));
		break;
	case "*":
		System.out.println("result: " + (a*b));
		break;
	case "/":
		System.out.println("result: " + (a/b));
		break;
	case "%":
		System.out.println("result: " + (a%b));
		break;
		
	}
	sc.close();
}
}
