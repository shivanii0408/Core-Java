package com.rays.exception;

public class Unchecked_Exception {
public static void main(String[] args) {
	try {
		dad();
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
private static void dad() {
	mom();
	// TODO Auto-generated method stub
	
}
private static void mom() {
	son();
	// TODO Auto-generated method stub
	
}
private static void son() {
	throw new RuntimeException("make a mistake");
	// TODO Auto-generated method stub
	
}

}
