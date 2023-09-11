package com;

import java.util.ArrayList;

public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="hello 500 hii 800";
		String s2="";
		ArrayList l1 = new ArrayList();
		for(int i=0;i<s1.length();i++) {
			char c= s1.charAt(i);
			if(c==' ') {
				if(s2.charAt(0)>='0'&&s2.charAt(0)<='9') {
				l1.add(s2);
				}
				s2="";
			}
			else {
				s2=s2+c;
			}
		}
		l1.add(s2);
		System.out.println(l1);
	}
}

