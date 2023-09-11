package com;

public class NestedIfDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=17;
		char g='F';
		if (g=='M') {
	      System.out.println("MALE");
	      if(age>=21) {
	    	  System.out.println("Eligible for Marriage");
	      }
	      else {
	    	  System.out.println("Not Eligible");
	      }
		}
		else if(g=='F') {
			System.out.println("FEMALE");
			if(age>=18) {
				System.out.println("Eligible for Marriage");
			}
			else {
				System.out.println("Not Eligible");
			}
		}

	}

}
