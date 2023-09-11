package com;

public class GrestestOfFourNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=70,b=30,c=40,d=90;
		if(a>b) {
			if(a>c) {
				if(a>d) {
					System.out.println("a is the greatest");
				}
					else {
						System.out.println("d is the greatest");
				}
			}
		}
		else if(b>c) {
			if(b>d) {
				System.out.println("b is the greatest");
			}
			else {
				System.out.println("d is the greatest");
			}
		}
		else if(c>d) {
			System.out.println("c is the greatest");
		}
		else {
			System.out.println("d is the greatest");
		}

	}

}
