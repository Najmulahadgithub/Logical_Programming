package com;

public class CountMaxNoOfAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="aabacd";
		
		char arr[] = s.toCharArray();
		int max=0;
		char ans=' ';
		for(int i=0;i<s.length();i++) {    //outer for loop traversing string
			char ch=s.charAt(i);
			int c=0;
			
			for(int j=0;j<arr.length;j++) {     //inner for loop traversing array
				if(ch==arr[j]) {
					c++;
					arr[j]='\0';
				}
			}
			if(max<c) {
				max=c;
				ans=ch;
			}
		}
		System.out.println(ans+":"+max);


	}

}
