package com;

public class Patterns5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubs
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) 
			{
				if(i==j) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("=============");
			int n1=4;
			for(int a=1;a<=n1;a++) {
				for(int b=n1;b>=1;b--) 
				{
					if(a==b) {
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

