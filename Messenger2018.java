package com;

public class Messenger2018 extends Messenger2016 {
	void notification() {
		super.notification();
		System.out.println("Double Tick");
	}
	void media() {
		super.media();
		System.out.println("Share Location, Videos");
	}
	void group() {
		super.group();
		System.out.println("Group Created");
	}
	void call() {
		System.out.println("Voice call");
	}

}
