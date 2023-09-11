package com;

import java.util.Scanner;

public class FindingPrimeNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int pos=sc.nextInt();
		int n=2,c=0;
		while(true) {
			int count=0;
			for(int i=2;i<=n/2;i++) {
				if(n%i==0) {
					count++;
				}
			}
			if(count==0) {
				c++;
			}
			if(c==pos) {
				System.out.println(n);
				break;
			}
			n++;
		}

	}

}
