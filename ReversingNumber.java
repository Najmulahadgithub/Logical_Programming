package com;

public class ReversingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1567;
		int count=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			System.out.println(rem);
			n=n/10;
			count++;
			
		}
		System.out.println("no of digits "+count);

	}

}
