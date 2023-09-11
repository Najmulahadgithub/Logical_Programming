package com;

public class CountStringabcd3211 {
	public static void main(String[] args) {
		String s="hehhelllllo";
		char arr[] = s.toCharArray();
		String ans1="";
		String ans2="";

		for(int i=0;i<s.length();i++) {    //outer for loop traversing string
			char ch=s.charAt(i);
			int c=0;
			for(int j=0;j<arr.length;j++) {     //inner for loop traversing array
				if(ch==arr[j]) {
					c++;
					arr[j]='\0';
				}
			}
			if(c>0) {
				ans1=ans1+ch;
				ans2=ans2+c;
			}
		}
		System.out.println(ans1+"-"+ans2);

	}

}
