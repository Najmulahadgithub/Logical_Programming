package com;

public class PrimeNumber {

	public static void main(String[] args) {
		int n=18;
		boolean flag=false;
		if(n==0||n==1) {
			System.out.println("It is not a Prime Number");
		}
		else {
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					flag=true;
					break;
				}
			}
			System.out.println(flag==false?"prime number":"not a prime number");
		}
		
	}

}
