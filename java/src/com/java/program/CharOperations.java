package com.java.program;

public class CharOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1='a';
		char ch2='B';
		char ch3='1';
		char ch4 =' ';
		String d=Character.toString(ch1);
		System.out.println(Character.isLetter(ch1));//to check letter
		System.out.println(Character.isDigit(ch3));// to check digit
		System.out.println(Character.isWhitespace(ch4));//to check white space
		System.out.println(Character.isUpperCase(ch2));//to check uppercase
		System.out.println(Character.isLowerCase(ch1));//to check lowercase
		System.out.println(Character.toLowerCase(ch2));//to convert into lowercase
		System.out.println(Character.toUpperCase(ch1));//to convert into uppercase
		System.out.println(Character.toString(ch1));//to convert into string
		System.out.println(d.getClass().getSimpleName());

	}

}
