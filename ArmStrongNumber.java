package com;

public class ArmStrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=153;
		int temp1=n;
		int temp2=n;
		int c=0;
		while(temp1!=0) {
			c++;
			temp1=temp1/10;
		}
		int sum=0,rem=0;
		while(temp2!=0) {
			rem=temp2%10;
			int ans=1;
			for(int i=1;i<=c;i++) {
				ans=ans*rem;
			}
			sum+=ans;
            temp2=temp2/10;		
            
		}
		System.out.println(sum);
		if(sum==n) {
			System.out.println("armstrong no");
		}
		else {
			System.out.println("not an armstrong no");
		}
		

	}

}
