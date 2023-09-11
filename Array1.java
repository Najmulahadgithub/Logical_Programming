package com;

import java.util.ArrayList;
import java.util.Collections;

public class Array1 {
	public static void main(String[] args) {
		int arr[]= {90,9,85,27,10,3,200,500,36,300,650};
		ArrayList l1 = new ArrayList();
		for(int ele:arr) {
			if(ele%4==0) {
				l1.add(ele);
			}
		}
		Collections.sort(l1);
		System.out.println(l1);
		int n=l1.size()-2;
		System.out.println(l1.get(n));
	}

}
