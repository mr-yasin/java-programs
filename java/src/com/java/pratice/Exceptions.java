package com.java.pratice;
import java.util.*;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=10;
			int b=1;
			float d=a/b;
			int arr[]= {1,2,3,4,5,6};
			System.out.println(arr[20]);			
			
		} catch (ArithmeticException e) {
			System.out.println(e);
			// TODO: handle exception
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}

	}

}
