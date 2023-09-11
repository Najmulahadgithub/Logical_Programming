package com;

public class Practise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		for(int i=0;i<s.length();i++) {
			int flag=0;
			for(int j=0;j<s.length();j++) {
				if(i!=j&&s.charAt(i)==s.charAt(j)) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				System.out.println(s.charAt(i));
			}
		}
	}

}
