package com;

public class NoOfDigits {

	public static void main(String[] args) 
	{
		int count=0;
		int n=1567987;
		while(n!=0) {
		//for(int i=0;i<=n;i++) {
			n=n/10;
			count++;
			
		}
		System.out.println(count);


	}

}
