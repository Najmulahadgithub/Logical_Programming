package com;

public class ArmStrongNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=143;
		int n1=n,n2=n,power=2,c=0;
		while(n!=0) {
			c++;
			n=n/10;
		}
		int rem=0,sum=0;
		while(n1!=0) {
			rem=n1%10;
			int ans=1;
			for(int i=1;i<=c;i++) {
				ans=ans*rem;
			}
			sum=sum+ans;
			n1=n1/10;
		}
		if(n2==sum) {
			System.out.println("ArmStrong No :"+n2);
		}
		else {
			System.out.println("Not a ArmStrong No :"+n2);
		}

	}

}
