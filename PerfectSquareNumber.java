package com;
import java.util.Scanner;

public class PerfectSquareNumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int num= s.nextInt();
		double x=Math.sqrt(num);
		if(x==(int)x) {
			System.out.println(num+"is a Perfect square");
		}
		else {
			System.out.println(num+"is not a Perfect square");
		}
		

	}

}
