package com.java.program;

public class ExplicityTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char a=10;
		
		/* char to int*/
		int b=Character.getNumericValue(a);
		System.out.println(((Object)b).getClass().getSimpleName());
		System.out.println();
		
		// int to char
		int c=2;
		char ch =Character.forDigit(c,10);
		System.out.println(ch);
		System.out.println(((Object)ch).getClass().getSimpleName());
		System.out.println();
	
		// int to string
		int d=25;
		String s=String.valueOf(d);
		System.out.println(s);
		System.out.println(s.getClass().getSimpleName());
		System.out.println();
		 // string to int 
		String m="25";
		int e=Integer.parseInt(m);
		System.out.println(e);
		System.out.println(((Object)e).getClass().getSimpleName());
		System.out.println();
        
		//string to float
		 // string to int 
		String n="25.77";
		float g=Integer.parseInt(m);
		System.out.println(g);
		System.out.println(((Object)g).getClass().getSimpleName());

	}

}
