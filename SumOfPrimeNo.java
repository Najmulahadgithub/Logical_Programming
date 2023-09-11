package com;

public class SumOfPrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		int sum=0;
		int isPrime=0;
		for(i=1;i<=10;i++) {
			isPrime=1;
			for(j=2;j<=i/2;j++) {
				if(i%j==0) {
					isPrime=0;
					break;
				}
			}
			if(isPrime==1) {
				sum=sum+i;
			}
		}
		System.out.println(sum);
		

	}

}
