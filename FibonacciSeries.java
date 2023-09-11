package com;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0;
		int n2=1;
		int n3=0;
		while(n1<=100) {
			System.out.println(n1);
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
	}

}
