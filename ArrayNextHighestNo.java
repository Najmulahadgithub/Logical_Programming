package com;

public class ArrayNextHighestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {10,8,7,8,16,7,88,76,58,70};
		int arr2[]=new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			boolean flag=false;
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]<arr1[j]) {
					arr2[i]=arr1[j];
					flag=true;
					break;
				}
			}
			if(flag==false) {
				arr2[i]=-1;
			}
		}
		for(int ele:arr2) {
			System.out.println(ele+" ");
		}

	}

}
