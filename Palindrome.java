package com;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=808;
		int rem=0;
		int sum=0;
		int temp=n;
		
		while(n!=0) {
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		if(temp==sum) {
			System.out.println("Its a Palindrome: "+temp);
      
	}
		else {
			System.out.println("Its not a Palindrome: "+temp);
		}
	}

}
