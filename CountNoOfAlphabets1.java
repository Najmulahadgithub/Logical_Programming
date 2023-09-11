package com;

public class CountNoOfAlphabets1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aaabbbacd";
		char arr[] = s.toCharArray();

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
				System.out.println(ch+":"+c);
			}
		}


	}

}
