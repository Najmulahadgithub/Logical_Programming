package com;

import java.util.Scanner;

public class Practise {

	public static void main(String[] args) {
		String s="NajMul Ahad SHehNaH";
		char arr[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			int c=0;
			for(int j=0;j<arr.length;j++) {
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
