package com;

public class Demo1 {

	public static void main(String[] args) {
	int a=10;
	int b=20;
	int c=30;
	int d=40;
	int e=0;
	System.out.println(a<b&&b<d);
	System.out.println((a>b||a!=d)&&(c>a||d==e));
	System.out.println(!((c!=d&&c==b)||(c>b||e>a)));
	System.out.println("----------");
	a+=10;
	b+=20;
	b-=10;
	e*=20;
	System.out.println((a>b||a!=d)&&(c>a||d==e));
	System.out.println(!((c!=d&&c==b)||(c>b||e>a)));
	System.out.println("------------");
	e=a++ + b++ + --c + ++d - c - d + ++a;
	System.out.println(e);
	System.out.println((a>b||a!=d)&&(c>a||d==e));
	System.out.println(!((c!=d&&c==b)||(c>b||e>a)));

	}

}
