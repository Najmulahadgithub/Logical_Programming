package com;

public class Patterns13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=2*n;j++) {
				if(i+j==n+1 || j-i==n-1) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
