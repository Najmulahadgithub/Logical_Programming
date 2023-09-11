package com;

public class AlphabetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='B';
		if((c>='a' && c<='z')||(c>='A' && c<='Z')) {
			System.out.println("Its a Alphabet");
		}
		else if(c>='0' && c<='9'){
			System.out.println("Its a Number");
		}
		else {
			System.out.println("Special Character");
		}

	}

}
