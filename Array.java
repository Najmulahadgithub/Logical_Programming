package com;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {1,2,5,7,8,10,11}; //7
		int arr2[]= {4,11,13,14}; //4
		int arr3[]=new int[arr1.length+arr2.length];
		int size=arr3.length;
		if(size>arr1.length) {
			size=arr1.length;
		}
		if(size>arr2.length) {
			size=arr2.length;
		}
		int k=0;
		for(int i=0;i<size;i++) {
			arr3[k]=arr1[i];
			k++;
			arr3[k]=arr2[i];
			k++;
		}
		if(arr1.length>arr2.length) {
			for(int i=size;i<arr1.length;i++) {
				arr3[k]=arr1[i];
				k++;
			}
		}
		else {
			for(int i=size;i<arr2.length;i++) {
				arr3[k]=arr2[i];
				k++;
			}
		}
		for(int ele:arr3) {
			System.out.println(ele);
		}
	}

}
