package com.java.pratice;

public class Throw {
	static void validateAge(int a) { 
		if(a<18) {
			throw new ArithmeticException("not a valid age");
		}
		else {
			System.out.println("valid Age ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		validateAge(a);

	}

}
