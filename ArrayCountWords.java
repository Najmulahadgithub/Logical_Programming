package com;

public class ArrayCountWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello 500 bye hi hello 300";
		int c=1;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==' ') {
				c++;
				}
		}
		System.out.println("No of Words "+c);

	}

}
