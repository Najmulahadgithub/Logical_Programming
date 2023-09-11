package com;

public class CountingNoInStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello123bye789hii";
		int sum=0;
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='0'&&c<='9') {
				int n=c-48;
				sum=sum+n;
			}
		}
		System.out.println(sum);

	}

}