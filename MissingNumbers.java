package com;

import java.util.ArrayList;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,4,8,7,14,5,9,18,20,16};
		for(int i=1;i<=20;i++) {
			boolean flag=false;
			for(int ele:arr) {
				if(i==ele) {
					flag=true;
					break;
				}
			}
			if(flag==false) {
				System.out.print(i+" ");
			}
		}
		System.out.println("\n--------------------------");
		ArrayList al =new ArrayList();
		for(int ele:arr) {
			al.add(ele);
		}
		for(int i=1;i<=20;i++) {
			if(al.contains(i)) {
			}
			else {
				System.out.print(i+" ");
			}
		}
	}

}
