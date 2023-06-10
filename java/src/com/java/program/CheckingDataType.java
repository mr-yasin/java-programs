package com.java.program;

public class CheckingDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean one =false; 	// true or false-1bit
		char a='A'; 			// \u0000 -2byte
		byte b=10;				//-128 to 127-1byte
		short c=177;			//-2**15 to 2**15-1 /0 -2byte
		int d=2000;				//-2**31 to 2**31-1/0-4byte
		long e=10000000l;		//-2**63 to 2**63-1/0l -8byte
		float f=0.25f;			//upto 7 decimal points /0.0f -4byte
		double g=29.0000896d;	// 0.0d /-8byte
		String userName="yasin";
		System.out.println(((Object)a).getClass().getSimpleName());
		System.out.println(((Object)b).getClass().getSimpleName());
		System.out.println(((Object)c).getClass().getSimpleName());
		System.out.println(((Object)d).getClass().getSimpleName());
		System.out.println(((Object)e).getClass().getSimpleName());
		System.out.println(((Object)f).getClass().getSimpleName());
		System.out.println(((Object)g).getClass().getSimpleName());
		System.out.println(userName.getClass().getSimpleName());


	}

}
