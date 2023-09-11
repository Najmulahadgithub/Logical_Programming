package com;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base=6;
		int power=4;
		int ans=1;
		for (int i=1;i<=power;i++) {
			ans=ans*base;
		}
		System.out.println("Power of given number is: "+ans);

	}

}
