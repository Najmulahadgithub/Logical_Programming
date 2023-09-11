package com;
import java.util.Scanner;

public class ReversingNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		int sum=0;
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a new number");
		a=s.nextInt();
		while(a>0) {
			b=a%10;
			a=a/10;
			sum=(sum*10)+b;
			
		}
		System.out.println("Reversed Number is "+sum);

	}

}
