package com;

public class StringArray {
	public static void main(String[] args) {
		String s1="Hello hi Bye";
		int sp=0;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				sp++;
			}
		}
		String arr[]= new String[sp+1];

		int in=0;
		String s2="";
		for(int i=0;i<s1.length();i++) {
			char c=s1.charAt(i);
			if(c==' ') {
				arr[in]=s2;
				in++;
				s2="";
			}
			else {
				s2=s2+c;
			}
			System.out.println(s2);
		}
		System.out.println("------------");
		arr[in]=s2;
		for(String item:arr) {
			System.out.println(item);

		}
	}

}
