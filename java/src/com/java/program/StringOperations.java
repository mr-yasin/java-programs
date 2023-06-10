package com.java.program;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="yasin";
		String s2="Hello";
		String s3="    hiii   ";
		String s4="hahahahaha";
		String s5="yasin";
		String s6="YASIN";
		System.out.println(s1.concat(" "+s2));//concat
		System.out.println((s1+" ").repeat(2));// string repeation
		System.out.println(s1.substring(0,5));//substrting
		System.out.println(s1.length());//length
		System.out.println(s1.charAt(3));//index 
		System.out.println(s3.trim());//to remove forward and backward spaces
		System.out.println(s1.toUpperCase());//to upper case
		System.out.println(s2.toLowerCase());//to lower case
		System.out.println(s1.startsWith("ya"));//to check start with
		System.out.println(s2.endsWith("lo"));//ends with
		System.out.println(s4.replace("a", "e"));//replace all
		System.out.println(s4.replaceFirst(" e", "a"));// replace first letter only
		System.out.println(s5.equals(s6)); //case sensitive
		System.out.println(s5.equalsIgnoreCase(s6));//case insensitive
		System.out.println(s5==s6);//compare memory location
		System.out.println(s5.compareTo(s6));//compare two strings based on the Unicode values
		System.out.println(s5.compareToIgnoreCase(s6));/*compare two strings based on the Unicode value
                                                         case insensitive */	
		

	}

}
