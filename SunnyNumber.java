package com;
import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter a number");
		Scanner s= new Scanner(System.in);
		num=s.nextInt();
		double root;
		root=Math.sqrt(num+1);
		if((int)root==root) {
			System.out.println("It is a sunny number");
		}
		else {
			System.out.println("It is not a sunny number");
		}
		

	}

}
