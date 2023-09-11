package com;

import java.util.Scanner;

public class HappyNumber {

	static int happyNumber(int n1) {
		int rem=0,sum=0;
		while (n1!=0) {
			rem=n1%10;
			sum=sum+(rem*rem);
			n1=n1/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int n1=scan.nextInt();
		while(n1!=1 && n1!=4) {
			n1=happyNumber(n1);
		}
		if(n1==1) {
			System.out.println("Happy Number");
		}
		else {
			System.out.println("UnHappy Number");
		}

	}
}
