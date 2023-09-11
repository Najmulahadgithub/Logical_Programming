package com;

public class BiggestWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello hi bye welcome";
		String arr[]=s.split(" ");
		int max=arr[0].length();
		String ans=arr[0];
		for(String ele:arr) {
			if(max<ele.length()) {
				max=ele.length();
				ans=ele;
			}
		}
		System.out.println(ans);

	}

}
