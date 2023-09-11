package com;

public class Messenger2020 extends Messenger2018 {
	void notification() {
		super.notification();
		System.out.println("Seen");
	}
	void media() {
		super.media();
		System.out.println("Links , Profile Share");
	}
	void group() {
		super.group();
		System.out.println("Members Added");
	}
	void call() {
		super.call();
		System.out.println("Vedio call");
	}
	void  status() {
		System.out.println("Status Uploaded");
	}


}
