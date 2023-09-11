package com;

public class NestedIfDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=700;
		int b=800;
		int c=600;
		int d=400;
		
		if(a>b) {
			if(a>c) {
				if(a>c) {
					System.out.println(a+"is the greatest number");
				}
				else {
					System.out.println(d+"is the greatest number");
				}
			}
		}
		if(b>c) {
			if(b>d){
				System.out.println(b+"is the greatest number");
			}
			else {
				System.out.println(d+"is the greatest number");
			}
		}
		if(c>a) {
			if(c>d) {
				System.out.println(c+"is the greatest number");
			}
			else {
				System.out.println(d+"is the greatest number");
			}
		}
		if(d>a){
		  if(d>b) {
			  if(d>c) {
				  System.out.println(d+"is the greatest number");
			  }
			  else {
				  System.out.println(b+"is the greatest number");
			  }
		  }
		}

	}

}
