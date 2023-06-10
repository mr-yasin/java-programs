package com.java.pratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class CharCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d="Yasin";
		d=d.toLowerCase();
		int l=d.length();
		HashSet<Character> hset=new HashSet<Character>();		
		for(int i=0;i<l;i++) {
			char ch=d.charAt(i);			
			hset.add(ch);
		}
		ArrayList<Character>arrList=new ArrayList<Character>(hset);		
		Collections.sort(arrList);		
		for(Character each:arrList) {
			int count=0;
			for(int j=0;j<l;j++) {
				if(each==d.charAt(j)) {
					count=count+1;					
				}
			}
			System.out.printf("  %c:%d\n",each,count);			
		}

	}

}
