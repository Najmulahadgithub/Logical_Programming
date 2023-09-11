package com;

import java.util.LinkedHashSet;

public class CountNoOfWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello hi hello how are you hi";
		String arr[]=s.split(" ");
		LinkedHashSet l1 = new LinkedHashSet();
		for(String ele:arr) {
			l1.add(ele);
		}
		System.out.println(l1);
		
		for(Object ele1:l1) {
			int c=0;
			for(String ele2:arr) {
				if(ele1.equals(ele2)) {
					c++;
				}
			}
			System.out.println(ele1+"-"+c);
		}
	}

}
