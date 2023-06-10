package com.java.program;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		String s;
		switch (a) {
		case 1: {
			s="Monday";
			break;			
		}
		case 2:{
			s="Tuesday";
			break;
		}
		case 3:{
			s="Wensday";
			break;
		}
		case 4:{
			s="Thursday";
			break;
		}
		case 5: {
			s="Friday";
			break;
		}
		case 6:{
			s="Saturday";
			break;			
		}
		case 7:{
			s="Sunday";
			break;		
		}
		
		default:
			s="Invalid Number";
			
		}
		System.out.println(s);
	}

}
