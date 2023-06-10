package com.java.pratice;

public class MaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				int arr[]= {1,2,3,6,99,22,33,101,202,98,306};
				int d=arr[0];
				
				for(int each :arr) {
					if(d<each) {
						d=each;
					}
				}	
				System.out.println(d);

	}

}
