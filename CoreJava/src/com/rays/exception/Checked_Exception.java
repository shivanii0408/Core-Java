package com.rays.exception;

public class Checked_Exception {
public static void main(String[] args) {
	try {
		dad();
	}catch(Exception e) {
		System.out.println("exception:" +e.getMessage());
	}
}

private static void dad() throws Exception {
	mom();
	// TODO Auto-generated method stub
	
}

private static void mom() throws Exception{
	son();
	// TODO Auto-generated method stub
	
}

private static void son() throws Exception{
	throw new Exception("make a mistake");
	// TODO Auto-generated method stub
	
}
}
