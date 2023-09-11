package com;

public class PerfectSquareNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=16;
		int flag=0;
		for(int i=1;i<=n/2;i++) {
			if(i*i==n) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			System.out.println("Perfect square number");
		}
		else {
			System.out.println("Not a Perfect square number");
		}

	}

}
