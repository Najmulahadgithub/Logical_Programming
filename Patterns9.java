package com;

public class Patterns9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1||j==1||i+j==6||i+j==5||i+j==4) {
					System.out.print("  *");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
