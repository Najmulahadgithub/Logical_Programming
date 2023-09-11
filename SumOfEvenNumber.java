package com;

public class SumOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1234;
		int sum=0;
		int rem=0;
		while(n!=0) {
			rem=n%10;
			if(rem%2==0) {
				sum+=rem;
			}
			n=n/10;
		}
		System.out.println("Sum of Even Numbers is:"+sum);

	}

}
