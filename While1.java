package com;

import java.util.Scanner;

public class While1 {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		while(true) {
		System.out.println("======CALCI=======");
		System.out.println("1.ADD\n2.SUB\n3.DIV\n4.MUL\n5.MOD\n6.EXIT");
		System.out.println("====Enter your Option====");
		int op=ip.nextInt();
		if(op==6) {
			System.out.println("=====BYE=====");
			System.exit(0);
		}
	    System.out.println("======Enter n1======");
	    int n1=ip.nextInt();
	    System.out.println("======Enter n2======");
	    int n2=ip.nextInt();
	    switch(op) {
	    case 1:System.out.println("ADD: "+(n1+n2));
	    break;
	    case 2:System.out.println("SUB: "+(n1-n2));
	    break;
	    case 3:System.out.println("DIV: "+(n1/n2));
	    break;
	    case 4:System.out.println("MUL: "+(n1*n2));
	    break;
	    case 5:System.out.println("MOD: "+(n1%n2));
	    break;
	    default:System.out.println("idiot give the correct option");
	    }
		}
		
	}

}
