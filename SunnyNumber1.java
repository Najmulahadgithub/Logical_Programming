package com;
import java.util.Scanner;

public class SunnyNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip= new Scanner(System.in);
		System.out.println("Enter a number to check: ");
		int k=ip.nextInt();
		int n=k+1;
		int ahad=0;
		for(int i=1;i<=n/2;i++) {
			if(i*i==n) {
				ahad=1;
				break;
			}
		}
		if(ahad==1) {
			System.out.println("Sunny no");
		}
		else {
			System.out.println("Not a Sunny no");
		}

	}

}
 