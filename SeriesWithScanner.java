package com;
import java.util.Scanner;

public class SeriesWithScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter a starting range");
		int n1=ip.nextInt();
		System.out.println("Enter a ending range");
		int n2=ip.nextInt();
		for(int i=n1;i<=n2;i++) {
			if(i%2==0) {
				System.out.println(i*2);
			}
			else {
				System.out.println(i*3);
			}
		}
		

	}

}
