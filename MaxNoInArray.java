package com;

import java.util.ArrayList;

public class MaxNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,10,200,700,36,300,659};
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
