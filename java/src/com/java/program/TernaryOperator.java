package com.java.program;

import java.util.Scanner;

public class TernaryOperator {

	
		// TODO Auto-generated method stub
		public static void greatestAmong(int a,int b,int c) {
			int d= a>b && a>c ? a:b>c && b>a ?b:c;
			System.out.println(d);
		}
			

		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			greatestAmong(a,b,c);
	}

}
