package com;

public class CountRepeatedNumbers {

	public static void main(String[] args) {
	int arr[]= {1,2,3,4,4,5};
	int max=0;
	int ans=0;
	for(int i=0;i<arr.length;i++) {
		int c=0;
		for(int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				c++;
			}
		}
		if(max<c) {
			ans=arr[i];
			max=c;
		}
	}
	System.out.println(ans);
	}

}
