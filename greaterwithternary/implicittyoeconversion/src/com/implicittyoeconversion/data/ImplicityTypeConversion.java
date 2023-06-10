package com.implicittyoeconversion.data;

public class ImplicityTypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='A';
		byte b=10;
		short c=177;
		int d=2000;
		long e=10000000l;
		float f=0.25f;
		double g=29.0000896d;
		System.out.println(((Object)(a+e)).getClass().getSimpleName());
		
		System.out.println(((Object)(a+(int)e)).getClass().getSimpleName());
		System.out.println(((Object)((long)a+e)).getClass().getSimpleName());
		System.out.println(((Object)(f+g)).getClass().getSimpleName());
		System.out.println(((Object)(f+(float)g)).getClass().getSimpleName());
		
		
		

	}

}
