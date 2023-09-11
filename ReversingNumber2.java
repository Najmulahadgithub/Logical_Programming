package com;

public class ReversingNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1567;
		int rem=0;
		int sum=0;
		while(n!=0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		System.out.println("Reversed number is "+sum);

	}

}
